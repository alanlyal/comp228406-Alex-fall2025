package org.example;
import javafx.application.Application;
import  javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import  javafx.stage.Stage;
public class App extends Application
{
    public void start(Stage window) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        window.setTitle("Lab 4 Student info");
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
