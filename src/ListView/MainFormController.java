package ListView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainFormController {

    public TextField txtInput;
    public TextField txtOuput;
    public ListView<String> lsLanguages;

    ObservableList<String> obList = FXCollections.observableArrayList();
    public void inputOnAction(ActionEvent actionEvent) {
        String lang = txtInput.getText();
        if(isExist(lang)){
            Alert alert = new Alert(Alert.AlertType.WARNING,"Already Exists");
            alert.show();
        return;
        }
        obList.add(lang);
        lsLanguages.setItems(obList);
        txtInput.clear();
    }

    public boolean isExist(String value){
        for (String temp: obList) {
            if(temp.equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }
}
