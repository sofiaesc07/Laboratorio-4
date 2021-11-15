/**
 * <h1> Laboratorio 4</h1>
 * <h2> Cancion</h2>
 * 
 *
 * Descripción: Clase creada con el proposito de guardar las canciones 
dentro de la radio. 
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

public class Cancion {
    
    //-------------------------------------------------------------------------------------
    //Propiedades
    private String nombre_cancion;

    private Integer duracion_cancion;

    private String autor_cancion;

    private String genero_cancion;

    //-------------------------------------------------------------------------------------
    //GETTERS
    public String getNombre_cancion() {
        return nombre_cancion;
    }
    public Integer getDuracion_cancion() {
        return duracion_cancion;
    }
    public String getAutor_cancion() {
        return autor_cancion;
    }
    public String getGenero_cancion() {
        return genero_cancion;
    }

    //----------------------------------------------------------------------------------------
    public Cancion(String n, Integer d, String a, String g){  //constructor
        this.nombre_cancion = n;
        this.duracion_cancion = d;
        this.autor_cancion = a;
        this.genero_cancion = g;
    }


}

//---------------------------------------------------------------------------------------------

/**
 * <h1> Laboratorio 4</h1>
 * <h2> Cancion</h2>
 * 
 *
 * Descripción: Clase creada con el proposito de guardar los contantos
 * dentro de la radio. 
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

class Contacto{

    private String nombre_contacto; //Propiedad para llamar a la clase Radio y colocar el nombre de alguna contacto según escoja el usuario

    private String numero_telefono; //Propiedad en la que se guarda algun numero telefonico

    public Contacto(String nc, String nt){  //Constructor
    // Constructor que llama a los atributos nombre_contacto y numero_telefono porque es lo que se debe ingresar al agregar un contacto

        this.nombre_contacto = nc;
        this.numero_telefono = nt;

    }

    //----------------------------------------------------------------
    //Getters para poder llamar estos atributos fuera de la clase Contacto
    //----------------------------------------------------------------
    
    public String getNombre_contacto() {
        return nombre_contacto;
    }
    public String getNumero_telefono() {
        return numero_telefono;
    }

}
