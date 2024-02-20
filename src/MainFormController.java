import javafx.scene.control.TextField;

public class MainFormController{


    public TextField txtEmail;
    public TextField txtResult;

    public void initialize() {
        txtEmail.textProperty().addListener((Observable,oldValue,newValue) ->{
            txtResult.setText(oldValue);
        }
    );

    }



}