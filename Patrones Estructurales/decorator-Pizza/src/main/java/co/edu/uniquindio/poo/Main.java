package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {

        //Creacion pizza con queso y peperoni
        Pizza quesoPeperoni = new PizzaBase();
        quesoPeperoni = new ConQueso(quesoPeperoni);
        quesoPeperoni = new ConPeperoni(quesoPeperoni);
        System.out.println("Orden: " + quesoPeperoni.descripcion() + " $ " + quesoPeperoni.costo());


        //Creacion de una pizza con queso y piña
        Pizza ConQuesoyPina = new PizzaBase();
        ConQuesoyPina = new ConQueso(ConQuesoyPina);
        ConQuesoyPina = new ConPina(ConQuesoyPina);
        System.out.println("Orden: " + ConQuesoyPina.descripcion() + " $ " + ConQuesoyPina.costo());



        //Creacion pizza con aceitunas
        Pizza aceituna = new PizzaBase();
        aceituna = new ConAceitunas(aceituna);
        System.out.println("Orden: " + aceituna.descripcion() + " $ " + aceituna.costo());


        //Creacion pizza con todo
        Pizza conTodo = new PizzaBase();
        conTodo = new ConAceitunas(conTodo);
        conTodo = new ConPeperoni(conTodo);
        conTodo = new ConPina(conTodo);
        conTodo = new ConQueso(conTodo);
        System.out.println("Orden: " + conTodo.descripcion() + " $ " + conTodo.costo());


    }
}