package co.edu.uniquindio.poo;

public class ConPina extends PizzaDecorator{

    /**
     * Constructor de la clase conPina
     * @param pizza
     */
    public ConPina(Pizza pizza){
        super(pizza);
    }

    /**
     * Metodo que retorna la descripcion de la pizza si se le agregan piña
     * @return
     */
    @Override
    public String descripcion(){
        return super.descripcion() + " + piña ";
    }

    /**
     * Metodo que retorna el costo de la pizza si se le agregan piña
     * @return
     */
    @Override
    public double costo(){
        return super.costo() + 4000.0;
    }



}
