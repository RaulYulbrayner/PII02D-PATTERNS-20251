package co.edu.uniquindio.poo.punto3;

import java.util.List;
import java.util.ArrayList;

// Punto 3.1 - A
// Implementación del Patrón Singleton para la clase Hotel
public class Hotel {

    private static Hotel instancia;
    private List<Cliente> clientes;
    private List<Reserva> reservas;
    private List<Habitacion> habitaciones;
    private List<SalonEvento> salonesEvento;

    private Hotel() {
        clientes = new ArrayList<>();
        reservas = new ArrayList<>();
        habitaciones = new ArrayList<>();
        salonesEvento = new ArrayList<>();
    }

    public static Hotel getInstancia() {
        if (instancia == null) {
            instancia = new Hotel();
        }
        return instancia;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }


    public void agregarSalonEvento(SalonEvento salon) {
        salonesEvento.add(salon);
    }

    public void eliminarSalonEvento(int idSalon) {
        for (int i = 0; i < salonesEvento.size(); i++) {
            if (salonesEvento.get(i).getIdSalon() == idSalon) {
                salonesEvento.remove(i);
                break;
            }
        }
    }

    public List<Cliente> obtenerClientesConMasDeTresConsonantes() {
        List<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : clientes) {
            String nombre = cliente.getNombre().replaceAll("[^a-zA-Z]", "");
            int contadorConsonantes = 0;
            for (char c : nombre.toCharArray()) {
                if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1) {
                    contadorConsonantes++;
                }
            }
            if (contadorConsonantes > 3) {
                resultado.add(cliente);
            }
        }
        return resultado;
    }

    public List<SalonEvento> getSalonesEvento() {
        return salonesEvento;
    }

    public void setSalonesEvento(List<SalonEvento> salonesEvento) {
        this.salonesEvento = salonesEvento;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
