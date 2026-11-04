public class Dueno {
    //Atributos
    private String nombre;
    private Integer telefono;

    //Constructor
   public Dueno (String nombre, String telefono){
       this.nombre = nombre;
       this.telefono = telefono;
   }
   //Metodos de acceso
    //Get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono (String telefono) {
       this.telefono = telefono;
    }
}
