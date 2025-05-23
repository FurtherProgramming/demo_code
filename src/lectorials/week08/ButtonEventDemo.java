package lectorials.week08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonEventDemo extends Application{
	public void start(Stage primaryStage) {
		Button button = new Button("Go to dashboard");
		button.setMaxSize(100, 50);

		// solution 1
//		button.setOnAction(new SayHello());

		// solution 2
//		button.setOnAction(e -> {
//			System.out.println("Hello World");
//		});
//		button.setOnAction(e -> {
//			Stage secondStage = new Stage();
//			secondStage.setTitle("DashBoard");
//			secondStage.setScene(new Scene(new Label("Welcome"), 300, 300));
//			secondStage.show();
//			primaryStage.close();
//		});

//		button.setOnAction(event -> {
//			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second.fxml"));
//
//		})

				
		Scene scene = new Scene(button, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Button Event Demo");
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
