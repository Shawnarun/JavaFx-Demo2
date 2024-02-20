import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainformController {

    public TextField txtName;
    public TextField txtPrintName;
    public TextField txtNameR;
    public TextField txtPrintNameR;

    public void onKeyPressedAction(KeyEvent keyEvent) {
        String value = txtName.getText();
        txtPrintName.setText(value);
    }

    public void onKeyRealeased(KeyEvent keyEvent) {
        String value2 = txtNameR.getText();
        txtPrintNameR.setText(value2);
    }
}