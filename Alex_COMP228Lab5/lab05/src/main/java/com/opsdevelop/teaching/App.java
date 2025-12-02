package com.opsdevelop.teaching;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
public class App extends Application{
    @Override
    public void start(Stage appStart) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/App.fxml"));
        Scene startUp = new Scene(loader.load());
        appStart.setTitle("lab 5 COMP228");
        appStart.setScene(startUp);
        appStart.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}