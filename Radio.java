/**
 * <h1> Laboratorio 4</h1>
 * <h2> Radio</h2>
 * 
 *
 * Descripción: Esta es la clase encargada de a funcionalidad del radio y de agregar 
intefareces via polimorfismo. 
 *
 * 
 * <p>
 * Programación Orientada a Objetos - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author [Evelyn Fernanda López Peiro, 21126]
 * @author [Pedro Camposeco, 21360]
 * @author [Ana Escobar, 20489]
 * @version 1.0
 * @since 2021-Noviembre-16
 * 
 * 
 **/ 

 //Importamos librerias
 import java.util.ArrayList;
 import java.util.Random;
 import java.util.Scanner;
 
 //------------------------------------------------------------------------
 public class Radio {
 
     //--------------------------------------------------------------------------
     //Propiedades
     protected Boolean radio_encendida = false;
 
     protected Integer volumen_radio = 1;
 
     protected String  modo_actual = "AM";
 
     protected Float emisora_actual = 95.5f;
 
     protected ArrayList<Float> emisoras_guardadas = new ArrayList<>();
 
     protected String[] lista_reproduccion = {"Mis Favoritas","Modo Concentracion"};
 
     protected Random rnd = new Random();
 
     protected ArrayList<Cancion> lista_canciones = new ArrayList<>();
 
     protected Integer posicion_cancion_actual = 0;
 
     protected Boolean telefono_conectado = false;
 
     protected ArrayList<Contacto> lista_contactos = new ArrayList<>();
 
     protected Boolean llamada_en_progreso = false;
 
     protected String Si_llamada_en_progreso_contacto = "";
 
     protected Scanner sc = new Scanner(System.in);
 
     //----------------------------------------------------------------------------
     //Constructor
     public Radio(){
 
         // Le agregariamos 2 canciones:
         this.lista_canciones.add(new Cancion("Lalala", 3, "Shakira", "Pop"));
         this.lista_canciones.add(new Cancion("Mosnter", 4, "Eminem", "Rap"));
 
         // Le agregariamos 2 contactos:
         this.lista_contactos.add(new Contacto("Rodolfo Aguirre", "5567-4568"));
         this.lista_contactos.add(new Contacto("Christian Leal", "3341-6745"));
 
     }
     
    
 
 }
 
 //-------------------------------------------------------
 // Interfaces que TODAS las clases mantienen:
 
 interface InterfazModoRadio{
     void CambiarFMAM();
     void CambiarEmisora();
     void GuardarEmisora();
     void CargarAEmisora();
 }
 interface InterfazModoReproduccion{
     void SeleccionarListaReproduccion();
     void CambiarCancionEnReproduccion();
     void EscucharCancion();
 }
 interface InterfazModoTelefono{
     void ConectarDesconectarTelefono();
     void MostrarContactos();
     void Finalizar_llamada();
 }
 
 //-------------------------------------------------------
 
 // Interfaces que solamente tienen los carros Clase S:
 interface IClaseS{
     void cambiar_bocinas_auriculares();
     void planificar_viajes();
 }
 // Interfaces que solamente tienen los carros Clase A:
 interface IClaseA{
     void llamar_ultimo_contacto();
     void ver_tarjetas_presentacion();
 }
 // Interfaces que solamente tienen los carros Clase C:
 interface IClaseC{
     void cambiar_llamada_espera();
     void ver_pronostico_tiempo();
 }
 //------------------------------------------------------------------------
 
 /**
  * <h1> Laboratorio 4</h1>
  * <h2> RadioCarroClaseS</h2>
  * 
  *
  * Descripción: Esta clase lleva a cabo todas las funcionalidades de radio pero
  *  para carros de tipo S por eso hereda de Radio
  *
  * 
  * <p>
  * Programación Orientada a Objetos - Universidad del Valle de Guatemala
  * </p>
  * 
  * Creado por:
  * 
  * @author [Evelyn Fernanda López Peiro, 21126]
  * @author [Pedro Camposeco, 21360]
  * @author [Ana Escobar, 20489]
  * @version 1.0
  * @since 2021-Noviembre-16
  * 
  * 
  **/ 
 
 class RadioCarroClaseS extends Radio implements InterfazModoRadio, InterfazModoReproduccion, InterfazModoTelefono, IClaseS{
 
     protected String bocinas_auriculares = "bocinas";
 
     // Metodos para InterfazModoRadio
     @Override
     public void CambiarFMAM() {
         if(this.modo_actual.equals("AM")){this.modo_actual = "FM";}
         else{this.modo_actual = "AM";}
         System.out.println("Se ha cambiado al modo " + this.modo_actual);
     }
     @Override
     public void CambiarEmisora() {
         this.emisora_actual += 0.5f;
         System.out.println("Se ha cambiado a la emisora " + this.emisora_actual);
     }
     @Override
     public void GuardarEmisora() {
         if(this.emisoras_guardadas.size() > 50){
             System.out.println("\nLimite de emisoras sobrepasado!\n");
         }
         else{this.emisoras_guardadas.add(this.emisora_actual);
         System.out.println("Se ha guardado la emisora actual " + this.emisora_actual);}
     }
     @Override
     public void CargarAEmisora() {
         System.err.println("Cargando emisora actual [" + this.modo_actual + "] " + this.emisora_actual);
     }
 
     // Metodos para InterfazModoReproduccion
     @Override
     public void SeleccionarListaReproduccion() {      
           int eleccion = rnd.nextInt(lista_reproduccion.length);
           System.out.println("Actualmente reproduciendo aleatoriamente la Playlist: "+lista_reproduccion[eleccion]);
         
     }
     @Override
     public void CambiarCancionEnReproduccion() {
         if(posicion_cancion_actual < lista_canciones.size()){
             // Todavia no se ha llegado al numero maximo que se puede acceder:
             System.out.println("Se ha cambiado de cancion a: " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
             posicion_cancion_actual++;
         }
         else{
             // Significa que ya se llego al size (2) de las canciones por lo que se vuelve 0;
             posicion_cancion_actual = 0;
         }
     }
     @Override
     public void EscucharCancion() {
         System.out.println("==== Escuchando Cancion ====");
         System.out.println("Nombre   : " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
         System.out.println("Duracion : " + lista_canciones.get(posicion_cancion_actual).getDuracion_cancion());
         System.out.println("Autor    : " + lista_canciones.get(posicion_cancion_actual).getAutor_cancion());
         System.out.println("Genero   : " + lista_canciones.get(posicion_cancion_actual).getGenero_cancion());
     }
     @Override
     public void ConectarDesconectarTelefono() {
         this.telefono_conectado = (telefono_conectado) ? false : true;
         if(telefono_conectado){
             System.out.println("El telefono se encuetra conectado.");
         }
         else{System.out.println("El telefono se encuetra desconectado.");}
 
     }
     @Override
     public void MostrarContactos() {
         System.out.println("== Imprimiendo Contactos ===");
         System.out.println("Conectando telefono para imprimir contactos...");
         telefono_conectado = true;
         for(Contacto c: lista_contactos){
             System.out.println("");
             System.out.println("Nombre: " + c.getNombre_contacto());
             System.out.println("Numero: " + c.getNumero_telefono());
             System.out.println("");
             // Le preguntamos si desea llamarlo, en caso de que si se empieza la llamada
             System.out.println("Desea llamarlo? [Y/N]");
             String respuesta = "";
             while(true){
                 System.out.print("Respuesta: ");
                 respuesta = sc.nextLine();
                 if(respuesta.equals("Y")){
                     llamada_en_progreso = true;
                     Si_llamada_en_progreso_contacto = c.getNombre_contacto();
                     System.out.println("\nSe ha entrado en llamada con: " + c.getNombre_contacto() + "\n");
                     return;
                 }
                 else{
                     break;
                 }
 
             }
         }
     }
     @Override
     public void Finalizar_llamada() {
         // Revisamos si esta en llamada, si no, se le avisa que no se puede finalizar:
         if(llamada_en_progreso){
             llamada_en_progreso = false;
             System.out.println("Colgando la llamada con: " + Si_llamada_en_progreso_contacto);
         }
         else{
             System.out.println("\nNo esta en llamada con nadie actualmente, intente mas tarde...\n");
         }
         
     }
     @Override
     public void cambiar_bocinas_auriculares() {
         this.bocinas_auriculares = (bocinas_auriculares.equals("bocinas")) ? "auriculares" : "bocinas";
         System.out.println("Se ha intercambiado a estar usando " + bocinas_auriculares + ".");
         
     }
     @Override
     public void planificar_viajes() {
         String viaje = "";
         System.out.println("¿A donde desea viajar?");
         viaje = sc.nextLine();
         System.out.println("Viaje a " + viaje + " planificado con exito.");        
     }
 }
 
 
 //------------------------------------------------------------------------
 
 /**
  * <h1> Laboratorio 4</h1>
  * <h2> RadioCarroClaseA</h2>
  * 
  *
  * Descripción: Esta clase lleva a cabo todas las funcionalidades de radio pero
  *  para carros de tipo A por eso hereda de Radio
  *
  * 
  * <p>
  * Programación Orientada a Objetos - Universidad del Valle de Guatemala
  * </p>
  * 
  * Creado por:
  * 
  * @author [Evelyn Fernanda López Peiro, 21126]
  * @author [Pedro Camposeco, 21360]
  * @author [Ana Escobar, 20489]
  * @version 1.0
  * @since 2021-Noviembre-16
  * 
  * 
  **/ 
 
 class RadioCarroClaseA extends Radio implements InterfazModoRadio, InterfazModoReproduccion, InterfazModoTelefono, IClaseA{
 
     protected String ultimo_contaco = "";
 
     @Override
     public void CambiarFMAM() {
         if(this.modo_actual.equals("AM")){this.modo_actual = "FM";}
         else{this.modo_actual = "AM";}
     }
     @Override
     public void CambiarEmisora() {
         this.emisora_actual += 05f;
     }
     @Override
     public void GuardarEmisora() {
         if(this.emisoras_guardadas.size() > 50){
             System.out.println("\nLimite de emisoras sobrepasado!\n");
         }
         else{this.emisoras_guardadas.add(this.emisora_actual);}
     }
     @Override
     public void CargarAEmisora() {
         System.err.println("Cargando emisora actual [" + this.modo_actual + "] " + this.emisora_actual);
     }
 
     @Override
     public void SeleccionarListaReproduccion() {      
           int eleccion = rnd.nextInt(lista_reproduccion.length);
           System.out.println("Actualmente reproduciendo aleatoriamente la Playlist: "+lista_reproduccion[eleccion]);
         
     }
     @Override
     public void CambiarCancionEnReproduccion() {
         if(posicion_cancion_actual < lista_canciones.size()){
             // Todavia no se ha llegado al numero maximo que se puede acceder:
             System.out.println("Se ha cambiado de cancion a " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
             posicion_cancion_actual++;
         }
         else{
             // Significa que ya se llego al size (2) de las canciones por lo que se vuelve 0;
             posicion_cancion_actual = 0;
         }
     }
     @Override
     public void EscucharCancion() {
         System.out.println("==== Escuchando Cancion ====");
         System.out.println("Nombre   : " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
         System.out.println("Duracion : " + lista_canciones.get(posicion_cancion_actual).getDuracion_cancion());
         System.out.println("Autor    : " + lista_canciones.get(posicion_cancion_actual).getAutor_cancion());
         System.out.println("Genero   : " + lista_canciones.get(posicion_cancion_actual).getGenero_cancion());
     }
     @Override
     public void ConectarDesconectarTelefono() {
         this.telefono_conectado = (telefono_conectado) ? false : true;
         if(telefono_conectado){
             System.out.println("El telefono se encuetra conectado.");
         }
         else{System.out.println("El telefono se encuetra desconectado.");}
     }
     @Override
     public void MostrarContactos() {
         System.out.println("== Imprimiendo Contactos ===");
         for(Contacto c: lista_contactos){
             System.out.println("");
             System.out.println("Nombre: " + c.getNombre_contacto());
             System.out.println("Numero: " + c.getNumero_telefono());
             System.out.println("");
             // Le preguntamos si desea llamarlo, en caso de que si se empieza la llamada
             System.out.println("Desea llamarlo? [Y/N]");
             String respuesta = "";
             while(true){
                 System.out.print("Respuesta: ");
                 respuesta = sc.nextLine();
                 if(respuesta.equals("Y")){
                     llamada_en_progreso = true;
                     Si_llamada_en_progreso_contacto = c.getNombre_contacto();
                     System.out.println("\nSe ha entrado en llamada con: " + c.getNombre_contacto() + "\n");
                     return;
                 }
                 else{
                     break;
                 }
 
             }
         }
     }
     @Override
     public void Finalizar_llamada() {
         // Revisamos si esta en llamada, si no, se le avisa que no se puede finalizar:
         if(llamada_en_progreso){
             llamada_en_progreso = false;
             System.out.println("Colgando la llamada con: " + Si_llamada_en_progreso_contacto);
             this.ultimo_contaco = Si_llamada_en_progreso_contacto;
         }
         else{
             System.out.println("\nNo esta en llamada con nadie actualmente, intente mas tarde...\n");
         }
         
     }
     @Override
     public void llamar_ultimo_contacto() {
         System.out.println("\nLlamando a tu ultimo contacto: " + ultimo_contaco + "\n");
         llamada_en_progreso = true;
         Si_llamada_en_progreso_contacto = ultimo_contaco;  
     }
     @Override
     public void ver_tarjetas_presentacion() {
         System.out.println("Viendo tarjetas de presentacion.");
     }
 }
 
 //------------------------------------------------------------------------
 
 /**
  * <h1> Laboratorio 4</h1>
  * <h2> RadioCarroClaseC</h2>
  * 
  *
  * Descripción: Esta clase lleva a cabo todas las funcionalidades de radio pero
  *  para carros de tipo C por eso hereda de Radio
  *
  * 
  * <p>
  * Programación Orientada a Objetos - Universidad del Valle de Guatemala
  * </p>
  * 
  * Creado por:
  * 
  * @author [Evelyn Fernanda López Peiro, 21126]
  * @author [Pedro Camposeco, 21360]
  * @author [Ana Escobar, 20489]
  * @version 1.0
  * @since 2021-Noviembre-16
  * 
  * 
  **/ 
 
 class RadioCarroClaseC extends Radio implements InterfazModoRadio , InterfazModoReproduccion, InterfazModoTelefono, IClaseC{
 
     protected Boolean llamada_en_espera = false;
 
     @Override
     public void CambiarFMAM() {
         if(this.modo_actual.equals("AM")){this.modo_actual = "FM";}
         else{this.modo_actual = "AM";}
     }
     @Override
     public void CambiarEmisora() {
         this.emisora_actual += 05f;
     }
     @Override
     public void GuardarEmisora() {
         if(this.emisoras_guardadas.size() > 50){
             System.out.println("\nLimite de emisoras sobrepasado!\n");
         }
         else{this.emisoras_guardadas.add(this.emisora_actual);}
     }
     @Override
     public void CargarAEmisora() {
         System.err.println("Cargando emisora actual [" + this.modo_actual + "] " + this.emisora_actual);
     }
 
     @Override
     public void SeleccionarListaReproduccion() {      
           int eleccion = rnd.nextInt(lista_reproduccion.length);
           System.out.println("Actualmente reproduciendo aleatoriamente la Playlist: "+lista_reproduccion[eleccion]);
         
     }
     @Override
     public void CambiarCancionEnReproduccion() {
         if(posicion_cancion_actual < lista_canciones.size()){
             // Todavia no se ha llegado al numero maximo que se puede acceder:
             System.out.println("Se ha cambiado de cancion a " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
             posicion_cancion_actual++;
         }
         else{
             // Significa que ya se llego al size (2) de las canciones por lo que se vuelve 0;
             posicion_cancion_actual = 0;
         }
     }
     @Override
     public void EscucharCancion() {
         System.out.println("==== Escuchando Cancion ====");
         System.out.println("Nombre   : " + lista_canciones.get(posicion_cancion_actual).getNombre_cancion());
         System.out.println("Duracion : " + lista_canciones.get(posicion_cancion_actual).getDuracion_cancion());
         System.out.println("Autor    : " + lista_canciones.get(posicion_cancion_actual).getAutor_cancion());
         System.out.println("Genero   : " + lista_canciones.get(posicion_cancion_actual).getGenero_cancion());
     }
     @Override
     public void ConectarDesconectarTelefono() {
         this.telefono_conectado = (telefono_conectado) ? false : true;
         if(telefono_conectado){
             System.out.println("El telefono se encuetra conectado.");
         }
         else{System.out.println("El telefono se encuetra desconectado.");}
     }
     @Override
     public void MostrarContactos() {
         System.out.println("== Imprimiendo Contactos ===");
         for(Contacto c: lista_contactos){
             System.out.println("");
             System.out.println("Nombre: " + c.getNombre_contacto());
             System.out.println("Numero: " + c.getNumero_telefono());
             System.out.println("");
             // Le preguntamos si desea llamarlo, en caso de que si se empieza la llamada
             System.out.println("Desea llamarlo? [Y/N]");
             String respuesta = "";
             while(true){
                 System.out.print("Respuesta: ");
                 respuesta = sc.nextLine();
                 if(respuesta.equals("Y")){
                     llamada_en_progreso = true;
                     Si_llamada_en_progreso_contacto = c.getNombre_contacto();
                     System.out.println("\nSe ha entrado en llamada con: " + c.getNombre_contacto() + "\n");
                     return;
                 }
                 else{
                     break;
                 }
 
             }
         }
     }
     @Override
     public void Finalizar_llamada() {
         // Revisamos si esta en llamada, si no, se le avisa que no se puede finalizar:
         if(llamada_en_progreso){
             llamada_en_progreso = false;
             System.out.println("Colgando la llamada con: " + Si_llamada_en_progreso_contacto);
         }
         else{
             System.out.println("\nNo esta en llamada con nadie actualmente, intente mas tarde...\n");
         }
         
     }
     @Override
     public void cambiar_llamada_espera() {
         if(llamada_en_progreso && llamada_en_espera == false){
             System.out.println("Poniendo llamada en espera con: " + Si_llamada_en_progreso_contacto);
             llamada_en_espera = true;
         }
         else if(llamada_en_progreso && llamada_en_espera == true){
             System.out.println("Quitando llamada en espera con: " + Si_llamada_en_progreso_contacto);
             llamada_en_espera = false;
         }
         else{
             System.out.println("\nNo esta en llamada con nadie actualmente, intente mas tarde...\n");
         }
         
     }
     @Override
     public void ver_pronostico_tiempo() {
         System.out.println("Viendo pronostico de tiempo..");
     }
 }