import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController{
    public ComboBox<String> cmbLanguages;
    public TextField txtSelectedLanguge;

//    ArrayList<String> myLanguages = new ArrayList<>(
//            Arrays.asList("Java","PHP","Kotlin","Ruby")
//    );

    public void initialize() {
        cmbLanguages.getItems().addAll("Java","PHP","Kotlin","Ruby");

        cmbLanguages.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable,oldValue,newValue) ->
                        {
                            txtSelectedLanguge.setText(newValue);
                        });

//        ObservableList<String> obList = FXCollections.observableList(myLanguages);
//        cmbLanguages.setItems(obList);

//        for (String name: myLanguages) {
//            cmbLanguages.getItems().add(name);
//        }

//        cmbLanguages.getItems().add("Java");

    }



}