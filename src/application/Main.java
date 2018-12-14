package application;
	
import javafx.application.Application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;



public class Main extends Application {
	
	

	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("N013.fxml"));
		
			Scene scene = new Scene(root);
			//(getClass().getResource("view/application.css"));
			primaryStage.setTitle("1818");
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
