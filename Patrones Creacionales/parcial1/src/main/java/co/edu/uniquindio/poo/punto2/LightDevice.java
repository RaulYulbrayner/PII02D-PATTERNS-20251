package co.edu.uniquindio.poo.punto2;

public class LightDevice implements SmartDevice {

    private int brillo;

    public LightDevice(int brillo) {
        this.brillo = brillo;
    }

    @Override
    public void turnOn() {
        System.out.println("Luz encendida con brillo: " + brillo);
    }

    @Override
    public void turnOff() {
        System.out.println("Luz apagada.");
    }
}
