package co.edu.uniquindio.poo.punto2;

import java.util.ArrayList;
import java.util.List;

// Patrón Singleton para el controlador de la casa inteligente

public class SmartHomeController {

    private static SmartHomeController instance;
    private List<SmartDevice> devices;

    private SmartHomeController() {
        devices = new ArrayList<>();
    }

    public static SmartHomeController getInstance() {
        if (instance == null) {
            instance = new SmartHomeController();
        }
        return instance;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnOnAll() {
        System.out.println("Encendiendo todos los dispositivos...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }
}
