package lectorials.week08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

    @Override
    public void start(Stage firstStage) throws Exception {
        // create JavaFX nodes
        Button button = new Button("Click me");

        button.setMaxSize(100, 50);

        // Add nodes to scene graph
        Scene scene = new Scene(button, 300, 300);

        // add scene to the stage
        firstStage.setScene(scene);
        firstStage.show();


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

