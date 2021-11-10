public class Cancion {
    
    private String nombre_cancion;

    private Integer duracion_cancion;

    private String autor_cancion;

    private String genero_cancion;

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

    public Cancion(String n, Integer d, String a, String g){
        this.nombre_cancion = n;
        this.duracion_cancion = d;
        this.autor_cancion = a;
        this.genero_cancion = g;
    }


}


class Contacto{

    private String nombre_contacto;

    private String numero_telefono;

    public Contacto(String nc, String nt){

        this.nombre_contacto = nc;
        this.numero_telefono = nt;

    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }
    public String getNumero_telefono() {
        return numero_telefono;
    }

}
