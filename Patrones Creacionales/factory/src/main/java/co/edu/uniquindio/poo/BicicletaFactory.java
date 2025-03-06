package co.edu.uniquindio.poo;

public class BicicletaFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Bicicleta();
    }
}
