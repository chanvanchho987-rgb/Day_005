package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("main/View.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);

        stage.setTitle("Mini Project 001");

        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("asset/itc-cambodia.jpg")));

        stage.show();
    }

}