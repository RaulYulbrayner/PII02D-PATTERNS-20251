package co.edu.uniquindio.poo;

public class Notificador {

    private static Notificador instancia;

    //Constructor
    private Notificador(){
    }

    public static Notificador getInstancia(){
        if(instancia == null){
            instancia = new Notificador();
        }
        return instancia;
    }

    public void notificar(String mensaje){
        System.out.println("NOTIFICACIÓN" + mensaje);
    }

}
