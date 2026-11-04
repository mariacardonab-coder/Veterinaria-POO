public class Gato extends Mascota {
    //Atributo
    private boolean usaArenero;
    public Gato(String nombre, int edad, Dueno dueno,  boolean usaArenero){
        super(nombre, "Gato",
               edad, dueno); //Llama al constructor del padre
        this.usaArenero = usaArenero;
    }
    public boolean getusaArenero(){
        return usaArenero;
    }
    //Sobreescribir los metodos del padre
    @Override
    public void hacerSonido(){
        System.out.println("Miau miau");
    }
    @Override
    public String toString(){
        return super.toString() + " - Usa arenero: " + usaArenero;

    }
}
