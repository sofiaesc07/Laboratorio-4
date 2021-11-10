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

            switch(vs.obtener_respuesta_modelo_s()){

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
        
    }
    public static void crear_carro_tipo_C(){

        RadioCarroClaseC radioC = new RadioCarroClaseC();
        
    }

}