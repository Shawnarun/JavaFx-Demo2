package Navigation2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowTwoController {
    public AnchorPane contextTwo;

    public void onActionBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource(
                        "../Navigation2/WindowOne.fxml"
                )
        );
        Stage stage = (Stage)contextTwo.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }
}
