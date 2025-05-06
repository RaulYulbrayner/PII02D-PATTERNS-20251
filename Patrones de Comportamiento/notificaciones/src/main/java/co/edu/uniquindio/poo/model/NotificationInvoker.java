package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class NotificationInvoker {

    private List<NotificationCommand> queue = new ArrayList<>();

    public void addCommand(NotificationCommand command) {
        queue.add(command);
    }

    public void executeCommands() {
        for (NotificationCommand command : queue) {
            command.execute();
        }
        queue.clear();
    }

}
