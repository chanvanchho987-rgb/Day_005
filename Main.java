import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch();
        
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
        
        FXMLLoader loader = new FXMLLoader();
        
        loader.setLocation(getClass().getResource("View.fxml"));

        Scene scene = new Scene(loader.load());

        stage.setScene(scene);

        stage.show();
    }
}
