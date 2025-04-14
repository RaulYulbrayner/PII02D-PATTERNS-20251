package co.edu.uniquindio.poo;

public class Cuenta {

    private String NombreUsuario,NombreBanco, id;
    private double saldo;

    public Cuenta(String nombreUsuario, String nombreBanco, String id, double saldo) {
        this.NombreUsuario = nombreUsuario;
        this.NombreBanco = nombreBanco;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
    public String getNombreBanco() {
        return NombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        NombreBanco = nombreBanco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "NombreUsuario='" + NombreUsuario + '\'' +
                ", NombreBanco='" + NombreBanco + '\'' +
                ", id='" + id + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
