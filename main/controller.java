package main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class controller {

    @FXML
    private Button btn_calculate;

    @FXML
    private ImageView pic_001;

    @FXML
    private ImageView pic_002;

    @FXML
    private TextArea text_num1;

    @FXML
    private TextArea text_num2;

    @FXML
    private TextArea text_num3;

    @FXML
    void on_calculate(ActionEvent event) {
        String str_num1 = text_num1.getText();
        String str_num2 = text_num2.getText();



        double db_num1 = Double.parseDouble(str_num1);
        double db_num2 = Double.parseDouble(str_num2);



        double db_sum = db_num1 + db_num2;

        String str_sum = String.valueOf(db_sum);

        text_num3.setText(str_sum);
        System.out.println("Sum: " + str_sum);

    }

}
