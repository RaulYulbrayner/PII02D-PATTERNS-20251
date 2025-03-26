package co.edu.uniquindio.poo.punto2;

public class SmartDeviceBuilder {

    private String tipo;
    private int brillo;
    private double temperatura;

    public SmartDeviceBuilder(String tipo) {
        this.tipo = tipo;
    }

    public SmartDeviceBuilder setBrillo(int brillo) {
        this.brillo = brillo;
        return this;
    }

    public SmartDeviceBuilder setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        return this;
    }

    public SmartDevice build() {
        if (tipo.equalsIgnoreCase("Light")) {
            return new LightDevice(brillo);
        } else if (tipo.equalsIgnoreCase("Thermostat")) {
                return new ThermostatDevice(temperatura);
        } else {
            throw new IllegalArgumentException("Tipo de dispositivo no soportado.");
        }
    }

}
