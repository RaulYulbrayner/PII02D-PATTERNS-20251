package co.edu.uniquindio.poo.model;

//Clase que representa una cuenta bancaria
public class Cuenta {
    private String id, titular,  tipo;
    private double saldo;

    // Constructor de la clase Cuenta
    public Cuenta(String id, String titular, double saldo, String tipo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Getters y Setters para los atributos de la clase
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo toString para representar la cuenta como una cadena
    @Override
    public String toString() {
        return "Cuenta{" +
                "id='" + id + '\'' +
                ", titular='" + titular + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
