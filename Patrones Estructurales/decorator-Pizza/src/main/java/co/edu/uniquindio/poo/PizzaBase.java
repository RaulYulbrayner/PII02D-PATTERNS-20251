package co.edu.uniquindio.poo;

public class PizzaBase implements Pizza{

    /**
     * Metodo que retorna la descripcion pizza base
     * @return
     */
    @Override
    public String descripcion() {
        return "Pizza Base";
    }

    /**
     * Metodo que retorna el costo pizza base
     * @return
     */
    @Override
    public double costo() {
        return 20000.0;
    }
}
