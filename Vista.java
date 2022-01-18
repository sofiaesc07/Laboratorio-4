/**
 * <h1> Laboratorio 4</h1>
 * <h2> Vista</h2>
 * 
 *
 * Descripción: Con esta clase podremos acceder a los métodos de la clase arrays para 


 * ejecutar las funcionalidades del programa.Clase que muestra mensajes
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
 import java.util.Scanner;

 public class Vista {
     
     public Scanner sc = new Scanner(System.in);
 
     public String modelo_de_carro(){ //Muestra un menu para escoger que tipo de modelo se desea inicializar el carro 
 
 
         System.out.println("= Porfavor elija su modelo =");
         System.out.println("[ 1 ] Clase S");
         System.out.println("[ 2 ] Clase A");
         System.out.println("[ 3 ] Clase C");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
 
         }
     }
 
     public Boolean encender_radio(){  //Menu que solo muestra la opción para encender la radio
 
         System.out.println("========== Radio ===========");   
         System.out.println("[ 1 ] Encender");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1")){
                 return true;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
 
         }
 
     }
 
     public String obtener_respuesta_modelo_sac(){ //Metodo para mostrar el menú general para los carros de modelo S, A  y C, es decir que todos los modelos pueden realizar estas opciones
 
         System.out.println("========== Radio  ==========");
         System.out.println("[ 1 ] Modo Radio");
         System.out.println("[ 2 ] Modo Reproduccion");
         System.out.println("[ 3 ] Modo Telefono");
         System.out.println("[ 4 ] Modo Productividad");
         System.out.println("[ 5 ] Apagar la radio");
 
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4" ) || respuesta.equals("5")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
 
         }
     }
 
     public String obtener_respuesta_modo_radio(){ //Metodo que tiene las opciones de modo radio como cambiar de FM a AM, cambiar emisoras etc.
         System.out.println("========== Modo Radio ==========");
         System.out.println("[ 1 ] Cambiar FM/AM");
         System.out.println("[ 2 ] Cambiar Emisoras");
         System.out.println("[ 3 ] Guardar Emisora actual");
         System.out.println("[ 4 ] Cargar emisora");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4")){
                 return respuesta;
            }
            else{
                System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
            }
        }
    }
 
     public String obtener_respuesta_modo_reproduccion(){
         //Metodo que tiene las opciones de modo reproducción como seleccionar una playlistm cambiar de canción, etc.
         System.out.println("========== Modo Reproduccion ==========");
         System.out.println("[ 1 ] Seleccionar lista de reproduccion");
         System.out.println("[ 2 ] Cambiar cancion");
         System.out.println("[ 3 ] Escuchar cancion");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
 
         }
     }
 
     public String obtener_respuesta_modo_telefono_modeloS(){
  //Metodo que tiene las opciones de modo telefono como conectar, desconectar, mostra rcontactos, finalizar llamadas etc. pero solamente para carros de modelo de TIPO S
 
 
         System.out.println("========== Modo Telefono ==========");
         System.out.println("[ 1 ] Conectar, desconectar telefono");
         System.out.println("[ 2 ] Mostrar contactos");
         System.out.println("[ 3 ] Finalizar llamada");
         System.out.println("[ 4 ] Cambiar a bocinas o auriculares");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 
     public String obtener_respuesta_modo_telefono_modeloA(){
 //Metodo que tiene las opciones de modo telefono como conectar, desconectar, mostra rcontactos, finalizar llamadas etc. pero solamente para carros de modelo de TIPO A
 
         System.out.println("========== Modo Telefono ==========");
         System.out.println("[ 1 ] Conectar, desconectar telefono");
         System.out.println("[ 2 ] Mostrar contactos");
         System.out.println("[ 3 ] Finalizar llamada");
         System.out.println("[ 4 ] Llamar al último contacto con el que se habló");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 
     public String obtener_respuesta_modo_telefono_modeloC(){
 //Metodo que tiene las opciones de modo telefono como conectar, desconectar, mostra rcontactos, finalizar llamadas etc. pero solamente para carros de modelo de TIPO C
         System.out.println("========== Modo Telefono ==========");
         System.out.println("[ 1 ] Conectar, desconectar telefono");
         System.out.println("[ 2 ] Mostrar contactos");
         System.out.println("[ 3 ] Finalizar llamada");
         System.out.println("[ 4 ] Cambiar a llamada en espera");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 
     public String obtener_respuesta_modo_productividad_modeloS(){
         //Metodo que tiene las opciones de modo productividades como planificar viajes pero unicamente para carros de modelo de tipo S
         System.out.println("========== Modo Productividad ==========");
         System.out.println("[ 1 ] Planificar viajes");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 
     public String obtener_respuesta_modo_productividad_modeloA(){
         //Metodo que tiene las opciones de modo productividades como planificar viajes pero unicamente para carros de modelo de tipo A
 
         System.out.println("========== Modo Productividad ==========");
         System.out.println("[ 1 ] Ver tarjetas de presentación");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 
     public String obtener_respuesta_modo_productividad_modeloC(){
         //Metodo que tiene las opciones de modo productividades como planificar viajes pero unicamente para carros de modelo de tipo C
         System.out.println("========== Modo Productividad ==========");
         System.out.println("[ 1 ] Ver pronóstico del tiempo");
         String respuesta = "";
         while(true){
             System.out.print("Opcion No: ");
             respuesta = sc.nextLine();
             if(respuesta.equals("1")){
                 return respuesta;
             }
             else{
                 System.out.println("\nRespuesta no reconocida, intenta de nuevo..\n");
             }
         }
     }
 }