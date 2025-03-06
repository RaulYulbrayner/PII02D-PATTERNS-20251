package co.edu.uniquindio.poo;

public class CarroFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Carro();
    }
}
