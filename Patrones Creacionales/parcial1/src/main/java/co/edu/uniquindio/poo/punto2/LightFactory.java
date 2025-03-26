package co.edu.uniquindio.poo.punto2;

public class LightFactory extends SmartDeviceFactory{

    @Override
    public SmartDevice createDevice() {
        return new LightDevice(50);
    }
}
