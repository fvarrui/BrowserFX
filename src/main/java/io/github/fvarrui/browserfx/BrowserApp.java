package io.github.fvarrui.browserfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BrowserApp extends Application {

	private BrowserController browserController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		browserController = new BrowserController();
		
		Scene scene = new Scene(browserController.getView());
		
		primaryStage.setTitle("BrowserFX");
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
