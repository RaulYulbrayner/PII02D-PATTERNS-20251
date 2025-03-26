package co.edu.uniquindio.poo.punto2;

public class ThermostatDevice implements SmartDevice{

    private double temperatura;

    public ThermostatDevice(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void turnOn() {
        System.out.println("Termostato encendido a " + temperatura + "°C");
    }

    @Override
    public void turnOff() {
        System.out.println("Termostato apagado.");
    }
}
