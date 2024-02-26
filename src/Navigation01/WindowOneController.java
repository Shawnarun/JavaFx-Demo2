package Navigation01;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowOneController {
    public void onActionNext(ActionEvent actionEvent) throws IOException {
        // path - > relative path and absoulte
        Stage stage = new Stage();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(
                                getClass().getResource("../Navigation01/WindowTwo.fxml")
                        )
                )
        );
        stage.show();
    }
}
