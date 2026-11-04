public class Perro extends Mascota {
    //Atributos
    private String raza;
    public Perro(String nombre, int edad,
                 Dueno dueno, String raza) {
        super(nombre, "Perro",
               edad, dueno); //llama al constructor del padre
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    //Sobrescribe los metodos del padre
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
    @Override
    public String toString(){
        return super.toString() + "- Raza: " + raza;
    }

}
