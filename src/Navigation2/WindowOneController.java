package Navigation2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowOneController {
    public AnchorPane contextOne;

    public void onActionNext(ActionEvent actionEvent) throws IOException {

        Parent parent = FXMLLoader.load(
                getClass().getResource(
                        "../Navigation2/WindowTwo.fxml"
                )
        );

        Stage stage = (Stage)contextOne.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }
}
