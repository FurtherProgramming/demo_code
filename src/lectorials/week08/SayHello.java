package lectorials.week08;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SayHello implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello World");
    }
}
