package co.edu.uniquindio.poo.punto2;

public class Main {

    public static void main(String[] args) {

        // Creación de dispositivos con Factory Method
        SmartDeviceFactory lightFactory = new LightFactory();
        SmartDeviceFactory thermostatFactory = new ThermostatFactory();

        SmartDevice light = lightFactory.createDevice();
        SmartDevice thermostat = thermostatFactory.createDevice();

        // Creación de un dispositivo personalizado con Builder
        SmartDevice customThermostat = new SmartDeviceBuilder("Thermostat")
                .setTemperatura(25.0)
                .build();

        SmartDevice customLight = new SmartDeviceBuilder("Light")
                .setBrillo(75)
                .build();

        // Uso del Singleton para gestionar dispositivos
        SmartHomeController controller = SmartHomeController.getInstance();
        controller.addDevice(light);
        controller.addDevice(thermostat);
        controller.addDevice(customThermostat);
        controller.addDevice(customLight);

        // Encender todos los dispositivos
        controller.turnOnAll();

    }

}
