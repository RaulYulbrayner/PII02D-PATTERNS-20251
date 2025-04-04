package co.edu.uniquindio.poo;

public abstract class PizzaDecorator implements Pizza{

     private Pizza pizza;

     /**
      * Constructor de la clase pizzaDecorator
      * @param pizza
      */
     public PizzaDecorator(Pizza pizza){
          this.pizza = pizza;
     }

     /**
      * Metodo que retorna la descripcion de la pizza
      * @return
      */
     @Override
     public String descripcion(){
          return pizza.descripcion();
     }

     /**
      * Metodo que retorna el costo de la pizza
      * @return
      */
     @Override
     public double costo() {
          return pizza.costo();
     }
}

