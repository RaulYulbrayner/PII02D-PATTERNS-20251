package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehiculoFactory factoryCarro = new CarroFactory();
        Vehiculo carro = factoryCarro.crearVehiculo();
        carro.conducir(); // Output: Conduciendo un carro...

        VehiculoFactory factoryMoto = new MotoFactory();
        Vehiculo moto = factoryMoto.crearVehiculo();
        moto.conducir(); // Output: Conduciendo una moto...

        VehiculoFactory factoryBicicleta = new BicicletaFactory();
        Vehiculo bicicleta = factoryBicicleta.crearVehiculo();
        bicicleta.conducir(); // Output: Pedaleando una bicicleta...

    }
}