/**
 * <h1> Laboratorio 4</h1>
 * <h2> Driver</h2>
 * 
 *
 * Descripción: Con esta clase podremos ingrsesar a los métodos de impresión de 
la clase vista para poder mostrarle el menú al usuario que esté 
interactuando con el programa.
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

class Driver{

    public static Vista vs = new Vista();

    public static Boolean radio_encendida = false;

    public static void main(String[] args) { //Este método es el que inicia todo y en el que se
        // instancian en controlador y el menú del controlador para que lleve a cabo todo el programa

        // Para comenzar, se le pregunta que tipo de carro desea tener:
        String tipo_de_carro = vs.modelo_de_carro();
        switch(tipo_de_carro){
            case "1":
            crear_carro_tipo_S();
            break;
            case "2":
            crear_carro_tipo_A();
            break;
            case "3":
            crear_carro_tipo_C();
            break;
        }
    }

    public static void crear_carro_tipo_S(){
        //Metodo para instanciar la clase RadioCarroClaseS e iniciar con sus funcionalidades

        //Instnacia de la clase RadioCarroClaseS
        RadioCarroClaseS radioS = new RadioCarroClaseS();

        //Mensaje de la vista para encender la radio
        radioS.radio_encendida = vs.encender_radio();

        // Empieza el Menu para el Modelo S:
        while(true){

            switch(vs.obtener_respuesta_modelo_sac()){

                case "1":
                // Modo radio
    
                switch(vs.obtener_respuesta_modo_radio()){
    
                    case "1":
                    //Para cambiar de FM a AM
                    radioS.CambiarFMAM();
    
                    break;
                
                    case "2":
                    //Para cambiar emisora, se cambia en intervalos de 0.5
                    radioS.CambiarEmisora();
    
                    break;
    
                    case "3":
                    //Para Guardar emisoras.Se pueden guardar hasta 50 estaciones de radio
                    radioS.GuardarEmisora();
    
                    break;
    
                    case "4":
                    //Para cargar emisoras
                    radioS.CargarAEmisora();
    
                    break;
    
                }
    
                break;
    
                case "2":
                // Modo reproduccion

                switch(vs.obtener_respuesta_modo_reproduccion()){

                    case "1":
                    //Para releccionar la lista de reproduccion
                    radioS.SeleccionarListaReproduccion();
    
                    break;
    
                    case "2":
                    //Para cambiar de cancion para adelante como para atras
                    radioS.CambiarCancionEnReproduccion();
    
                    break;
    
                    case "3":
                    //Para escuchar una cancion mostranro nombre, duracion, autor y genero de la cancion
                    radioS.EscucharCancion();
    
                    break;

                }

                break;
    
                case "3":
                // Modo telefono:

                switch(vs.obtener_respuesta_modo_telefono_modeloS()){

                    case "1":
                    //pAR ACONCNETAR O DESCONECTAR EL TELEFONO
                    radioS.ConectarDesconectarTelefono();
    
                    break;
    
                    case "2":
                    //Para mostrar contactos
                    radioS.MostrarContactos();
    
                    break;
    
                    case "3":
                    //Para finalizar una llamar
                    radioS.Finalizar_llamada();
    
                    break;

                    case "4":
                    //Para cambiar a bonias o auriculares
                    radioS.cambiar_bocinas_auriculares();

                    break;
                    
                }

                break;
    
                case "4":
                //Para planiricar vaijes
                if(vs.obtener_respuesta_modo_productividad_modeloS().equals("1")){
                    radioS.planificar_viajes();
                }
                break;

                case "5":

                break;
            }
        }
    }

    public static void crear_carro_tipo_A(){ //Metodo para instanciar la clase RadioCarroClaseA e
        // iniciar con sus funcionalidades que se detallan en el documento

        //Instnacia de la clase RadioCarroClaseA
        RadioCarroClaseA radioA = new RadioCarroClaseA();

       // Empieza el Menu para el Modelo A:
        while(true){

            switch(vs.obtener_respuesta_modelo_sac()){

                case "1":
                // Modo radio
    
                switch(vs.obtener_respuesta_modo_radio()){
    
                    case "1":
    
                    radioA.CambiarFMAM();
    
                    break;
    
                    case "2":
    
                    radioA.CambiarEmisora();
    
                    break;
    
                    case "3":
    
                    radioA.GuardarEmisora();
    
                    break;
    
                    case "4":
    
                    radioA.CargarAEmisora();
    
                    break;
    
                }
    
                break;
    
                case "2":
                // Modo reproduccion

                switch(vs.obtener_respuesta_modo_reproduccion()){

                    case "1":
    
                    radioA.SeleccionarListaReproduccion();
    
                    break;
    
                    case "2":
    
                    radioA.CambiarCancionEnReproduccion();
    
                    break;
    
                    case "3":
    
                    radioA.EscucharCancion();
    
                    break;

                }

                break;
    
                case "3":
                // Modo telefono:

                switch(vs.obtener_respuesta_modo_telefono_modeloA()){

                    case "1":
    
                    radioA.ConectarDesconectarTelefono();
    
                    break;
    
                    case "2":
    
                    radioA.MostrarContactos();
    
                    break;
    
                    case "3":
    
                    radioA.Finalizar_llamada();
    
                    break;

                    case "4":

                    radioA.llamar_ultimo_contacto();

                    break;
                    
                }

                break;
    
                case "4":
                if(vs.obtener_respuesta_modo_productividad_modeloA().equals("1")){
                    radioA.ver_tarjetas_presentacion();
                }
                break;

                case "5":

                break;
    
            }
        }        
    }

    public static void crear_carro_tipo_C(){ // Método para instanciar 
        //la clase RadioCarroClaseC e iniciar con sus funcionalidades 

        //Instnacia de la clase RadioCarroClaseC
        RadioCarroClaseC radioC = new RadioCarroClaseC();
       // Empieza el Menu para el Modelo S:
        while(true){

            switch(vs.obtener_respuesta_modelo_sac()){

                case "1":
                // Modo radio
    
                switch(vs.obtener_respuesta_modo_radio()){
    
                    case "1":
    
                    radioC.CambiarFMAM();
    
                    break;
    
                    case "2":
    
                    radioC.CambiarEmisora();
    
                    break;
    
                    case "3":
    
                    radioC.GuardarEmisora();
    
                    break;
    
                    case "4":
    
                    radioC.CargarAEmisora();
    
                    break;

                    case "5":

                    break;
                }
    
                break;
    
                case "2":
                // Modo reproduccion

                switch(vs.obtener_respuesta_modo_reproduccion()){

                    case "1":
    
                    radioC.SeleccionarListaReproduccion();
    
                    break;
    
                    case "2":
    
                    radioC.CambiarCancionEnReproduccion();
    
                    break;
    
                    case "3":
    
                    radioC.EscucharCancion();
    
                    break;

                }

                break;
    
                case "3":
                // Modo telefono:

                switch(vs.obtener_respuesta_modo_telefono_modeloS()){

                    case "1":
    
                    radioC.ConectarDesconectarTelefono();
    
                    break;
    
                    case "2":
    
                    radioC.MostrarContactos();
    
                    break;
    
                    case "3":
    
                    radioC.Finalizar_llamada();
    
                    break;

                    case "4":

                    radioC.cambiar_llamada_espera();

                    break;
                }

                break;
    
                case "4":
                if(vs.obtener_respuesta_modo_productividad_modeloC().equals("1")){
                    radioC.ver_pronostico_tiempo();
                }
                break;

                case "5":

                break;
                
            }
        }        
    }
}