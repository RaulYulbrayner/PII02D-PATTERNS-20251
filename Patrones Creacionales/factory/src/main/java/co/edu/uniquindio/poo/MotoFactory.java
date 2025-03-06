package co.edu.uniquindio.poo;

public class MotoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
