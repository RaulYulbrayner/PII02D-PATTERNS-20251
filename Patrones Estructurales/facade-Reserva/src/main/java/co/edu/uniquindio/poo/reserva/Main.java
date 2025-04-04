package co.edu.uniquindio.poo.reserva;

public class Main {
    public static void main(String[] args) {
        HotelFacade hotel = new HotelFacade();

        // Ejemplo de uso
        hotel.verHabitacionesDisponibles();
        hotel.reservar("Juan Pérez", "INDIVIDUAL", "2023-12-15");
        hotel.verHabitacionesDisponibles();
        hotel.cancelarReserva("Juan Pérez");
    }
}
