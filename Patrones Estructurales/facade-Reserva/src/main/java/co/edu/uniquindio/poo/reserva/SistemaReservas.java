package co.edu.uniquindio.poo.reserva;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Reserva> reservas = new ArrayList<>();
    private String[] habitacionesIndividuales = {"101", "102", "103"};
    private String[] habitacionesDobles = {"201", "202"};

    public boolean verificarDisponibilidad(String tipo, String fecha) {
        // Lógica simplificada: siempre hay disponibilidad en este ejemplo básico
        return true;
    }

    public void mostrarDisponibilidad() {
        System.out.println("\nHabitaciones disponibles:");
        System.out.println("Individuales: " + String.join(", ", habitacionesIndividuales));
        System.out.println("Dobles: " + String.join(", ", habitacionesDobles));
    }

    public void registrarReserva(String nombre, String tipo, String fecha, double precio) {
        reservas.add(new Reserva(nombre, tipo, fecha, precio));
        System.out.println("Reserva registrada para " + nombre);
    }

    public void cancelarReserva(String nombre) {
        reservas.removeIf(r -> r.getNombreCliente().equals(nombre));
        System.out.println("Reserva cancelada para " + nombre);
    }
}
