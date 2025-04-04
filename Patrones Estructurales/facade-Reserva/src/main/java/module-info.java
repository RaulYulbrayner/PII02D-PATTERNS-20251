module co.edu.uniquindio.poo.reserva {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.reserva to javafx.fxml;
    exports co.edu.uniquindio.poo.reserva;
}