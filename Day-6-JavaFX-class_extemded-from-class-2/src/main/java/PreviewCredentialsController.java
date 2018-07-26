import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.io.IOException;

public class PreviewCredentialsController {

    @FXML private Label lblShowStudentInfo;
    @FXML
    public void initialize() {
        String names = "";
        for (Student s: DataStore.students){
            names += s.getUsername()+"\n";
        }
        lblShowStudentInfo.setText(names);
    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        Main.sceneLoader(root,"Main window");
    }
}
