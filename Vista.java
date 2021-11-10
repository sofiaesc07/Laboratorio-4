import java.util.Scanner;

public class Vista {
    
    public Scanner sc = new Scanner(System.in);

    public String modelo_de_carro(){

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

    public Boolean encender_radio(){

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

    public String obtener_respuesta_modelo_s(){

        System.out.println("========== Radio Modelo S ==========");
        System.out.println("[ 1 ] Modo Radio");
        System.out.println("[ 2 ] Modo Reproduccion");
        System.out.println("[ 3 ] Modo Telefono");
        System.out.println("[ 4 ] Modo Productividad");

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

    public String obtener_respuesta_modo_radio(){
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

    // tendrias que hacer uno para los otros dos modelos:
    public String obtener_respuesta_modo_telefono_modeloS(){

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


    // tendrias que hacer uno por cada modelo:
    public String obtener_respuesta_modo_productividad_modeloS(){
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
    

}
