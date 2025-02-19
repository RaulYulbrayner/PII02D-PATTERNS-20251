package co.edu.uniquindio.poo;

public class Notificador {

    /**
     * Instancia única de la clase Notificador
     */
    private static Notificador instancia;

    /**
     * Constructor privado para evitar la creación de instancias fuera de esta clase
     */
    private Notificador(){
    }

    /**
     * Método estático que devuelve la única instancia de la clase Notificador
     * Si la instancia no existe, se crea.
     * @return la instancia única de Notificador.
     */
    public static Notificador getInstancia(){
        if(instancia == null){
            instancia = new Notificador();
        }
        return instancia;
    }

    /**
     * Método para enviar una notificación con un mensaje por consola
     * @param mensaje el mensaje que se desea notificar.
     */
    public void notificar(String mensaje){
        System.out.println("NOTIFICACIÓN" + mensaje);
    }

}
