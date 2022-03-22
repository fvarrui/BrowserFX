package io.github.fvarrui.browserfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

public class BrowserController implements Initializable {
	
	// view
	
    @FXML
    private BorderPane view;

    @FXML
    private WebView webView;
    
    public BrowserController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/BrowserView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		webView.getEngine().load(getClass().getResource("/hook-theme-master/index.html").toString());
		
	}

	public BorderPane getView() {
		return view;
	}
    
}
