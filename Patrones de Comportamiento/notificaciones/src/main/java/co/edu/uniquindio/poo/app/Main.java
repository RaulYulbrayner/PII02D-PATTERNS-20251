package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear usuario
        User user = new ClientUser("cliente@mail.com", false);

        // Crear notificación
        Notification notification = new Notification(user, "Tu perfil ha sido actualizado.");

        // Establecer estrategia
        notification.setStrategy(new EmailNotification());

        // Crear cadena de filtros (Chain of Responsibility)
        NotificationFilter filter = new EmptyMessageFilter();
        filter.setNext(new BlockedUserFilter());

        // Validar notificación
        if (filter.handle(notification)) {
            // Crear y ejecutar comando (Command)
            NotificationCommand command = new SendNotificationCommand(notification);
            NotificationInvoker invoker = new NotificationInvoker();
            invoker.addCommand(command);
            invoker.executeCommands();
        }
    }
}