package co.edu.uniquindio.poo.punto3;

// Implementación del Patrón Singleton para la clase Hotel
// Punto 3.1 - A
public class Main {

    public static void main(String[] args) {

        Hotel hotel = Hotel.getInstancia();

        Cliente cliente1 = new Cliente("Juan Pérez");
        Cliente cliente2 = new Cliente("María López");
        hotel.agregarCliente(cliente1);
        hotel.agregarCliente(cliente2);

        Habitacion habitacion1 = new Habitacion(101);
        Habitacion habitacion2 = new Habitacion(102);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        Reserva reserva1 = new Reserva(cliente1, habitacion1);
        Reserva reserva2 = new Reserva(cliente2, habitacion2);
        hotel.agregarReserva(reserva1);
        hotel.agregarReserva(reserva2);

        SalonEvento salon1 = new SalonEvento.SalonBuilder()
                .setNombre("Gran Salón")
                .setCapacidad(200)
                .setTieneProyector(true)
                .build();
        hotel.agregarSalonEvento(salon1);

        System.out.println("Clientes:");
        for (Cliente c : hotel.getClientes()) {
            System.out.println("- " + c.getNombre());
        }

        System.out.println("\nReservas:");
        for (Reserva r : hotel.getReservas()) {
            System.out.println("- Cliente: " + r.getCliente().getNombre() + ", Habitación: " + r.getHabitacion().getCodHabitacion());
        }

        System.out.println("\nSalones de Evento:");
        for (SalonEvento salonEvento : hotel.getSalonesEvento()) {
            System.out.println("- " + salonEvento.getNombre() + " (Capacidad: " + salonEvento.getCapacidad() + ", Proyector: " + salonEvento.isTieneProyector() + ")");
        }

    }

}
