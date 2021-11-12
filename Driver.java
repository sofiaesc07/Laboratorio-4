/***************************************************************************
Driver.java

Autores: 
Pedro Camposeco - 21360
Ana Escobar - 20489
Evelyn López - 21126

Con esta clase podremos ingrsesar a los métodos de impresión de 
la clase vista para poder mostrarle el menú al usuario que esté 
interactuando con el programa.
****************************************************************************/
class Driver{

    public static Vista vs = new Vista();

    public static Boolean radio_encendida = false;
    public static void main(String[] args) {
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

        RadioCarroClaseS radioS = new RadioCarroClaseS();

        radioS.radio_encendida = vs.encender_radio();

        // Empieza el Menu para el Modelo S:
        while(true){

            switch(vs.obtener_respuesta_modelo_sac()){

                case "1":
                // Modo radio
    
                switch(vs.obtener_respuesta_modo_radio()){
    
                    case "1":
    
                    radioS.CambiarFMAM();
    
                    break;
    
                    case "2":
    
                    radioS.CambiarEmisora();
    
                    break;
    
                    case "3":
    
                    radioS.GuardarEmisora();
    
                    break;
    
                    case "4":
    
                    radioS.CargarAEmisora();
    
                    break;
    
                }
    
                break;
    
                case "2":
                // Modo reproduccion

                switch(vs.obtener_respuesta_modo_reproduccion()){

                    case "1":
    
                    radioS.SeleccionarListaReproduccion();
    
                    break;
    
                    case "2":
    
                    radioS.CambiarCancionEnReproduccion();
    
                    break;
    
                    case "3":
    
                    radioS.EscucharCancion();
    
                    break;

                }

                break;
    
                case "3":
                // Modo telefono:

                switch(vs.obtener_respuesta_modo_telefono_modeloS()){

                    case "1":
    
                    radioS.ConectarDesconectarTelefono();
    
                    break;
    
                    case "2":
    
                    radioS.MostrarContactos();
    
                    break;
    
                    case "3":
    
                    radioS.Finalizar_llamada();
    
                    break;

                    case "4":

                    radioS.cambiar_bocinas_auriculares();

                    break;
                    
                }

                break;
    
                case "4":
                if(vs.obtener_respuesta_modo_productividad_modeloS().equals("1")){
                    radioS.planificar_viajes();
                }
                break;
            }
        }
    }

    public static void crear_carro_tipo_A(){

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
    
            }
        }        
    }

    public static void crear_carro_tipo_C(){

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
                
                return;
            }
        }        
    }
}