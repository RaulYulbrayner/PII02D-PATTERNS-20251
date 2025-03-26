package co.edu.uniquindio.poo.punto2;

public class ThermostatFactory extends SmartDeviceFactory{

    @Override
    public SmartDevice createDevice() {
        return new ThermostatDevice(22.5);
    }

}
