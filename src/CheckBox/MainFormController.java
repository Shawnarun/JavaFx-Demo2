package CheckBox;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;


public class MainFormController {

    public CheckBox cbxJava;
    public CheckBox cbxPhp;
    public CheckBox cbxRuby;

    public void printDataCheckBoxOnAction(ActionEvent actionEvent) {
        ArrayList<String> languages = new ArrayList<>();
        if(cbxJava.isSelected()){languages.add("JAVA");}
        if(cbxPhp.isSelected()){languages.add("PHP");}
        if(cbxRuby.isSelected()){languages.add("RUBY");}

        System.out.println(languages);
    }
}
