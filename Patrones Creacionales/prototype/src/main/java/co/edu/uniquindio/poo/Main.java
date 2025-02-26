package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos el personaje de tipo mago base
        Personaje mago = new Mago("Veigar", 100, 8000);

        //Clonar el persona base y lo vamos a personalizar
        Personaje mago1 = mago.clone();
        mago1.setNombre("Mago malo");
        mago1.setVida(80);
        mago1.setFuerza(20);

        //Clonar otro
        Personaje mago2 = mago.clone();
        mago2.setNombre("Mago bueno");
        mago2.setVida(1000);
        mago2.setFuerza(1200);

        //Mostrar
        System.out.println(mago.toString());
        System.out.println(mago1.toString());
        System.out.println(mago2.toString());

    }
}