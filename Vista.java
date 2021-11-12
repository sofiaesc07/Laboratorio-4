/***************************************************************************
Vista.java

Autores: 
Pedro Camposeco - 21360
Ana Escobar - 20489
Evelyn López - 21126

Con esta clase podremos acceder a los métodos de la clase arrays para 
ejecutar las funcionalidades del programa.
****************************************************************************/

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

    public String obtener_respuesta_modelo_sac(){

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

    public String obtener_respuesta_modo_telefono_modeloA(){

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