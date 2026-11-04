import java.lang.reflect.Array;
import java.util.ArrayList;

public class Veterinaria {
    //Atributos
    private ArrayList<Mascota>
    pacientes = new ArrayList<>();
    public void registrar(Mascota m) {
        pacientes.add(m);
        System.out.println("Registrada: " + m);
    }
    public void listar(){
        System.out.println("\n--- Pacientes (" + pacientes.size() + ") ---");
        for (Mascota m: pacientes) {
            System.out.println(m);
        }
        /**
         *Polimorfismo: recorremos Mascotas y llamamos hacerSonido().
         * Java ejecuta la versión del perro o del gato según el objeto real.
         */
        public void pasarRevista(){
            System.out.println("\n---pasando revista ---");
            for (Mascota m : pacientes) {
                System.out.print(m.getNombre() + "dice: ");
                m.hacerSonido();
            }
        }
    }
}
