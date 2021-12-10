package Temperature;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField inp;
    public Button btn;
    public Label lbl;

    public void onfunc(ActionEvent actionEvent) {

        String celsius = inp.getText();
        int celsiusTemp = Integer.parseInt(celsius);

        double fahrenheitTemp = celsiusTemp * 1.8 + 32;
        int fahrenheitInt = (int) fahrenheitTemp;

        lbl.setText("The temperature in Fahrenheit is " + fahrenheitInt);



    }
}
