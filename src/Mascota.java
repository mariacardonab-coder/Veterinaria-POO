public  abstract class Mascota {
    //Atributos
    private String nombre;
    private String especie;
    private int edad;
    //Relacion con el dueño
    private Dueno dueno;
    //Constructor
    public Mascota (String nombre, String especie, int edad, Dueno dueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueno = dueno;
    }
    //Metodos de acceso
    //Get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Dueno getDueno () {
        return dueno ;
    }
    public abstract void hacerSonido();
    @Override
    public String toString() {
        return nombre + "(" + especie + ", "+ edad +  "años)" +
            "-Dueno: " + dueno.getNombre();
    }
}
