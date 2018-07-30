import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginScreenController {

    @FXML private TextField name;
    @FXML private TextField dept;
    StudentDao studentDao = new StudentDaoImpl();
    int generatedId = 0;

    @FXML
    public void performClickAction(ActionEvent actionEvent) throws IOException {

        Student student = new Student(++generatedId, name.getText(), dept.getText());
        studentDao.addStudent(student);

        Parent root = FXMLLoader.load(getClass().getResource("PreviewCredentials.fxml"));
        Main.sceneLoader(root,"2nd window");

    }
}
