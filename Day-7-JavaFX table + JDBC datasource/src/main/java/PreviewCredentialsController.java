import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class PreviewCredentialsController {

    @FXML
    private Pane pane;
    ObservableList<Student> students  = FXCollections.observableArrayList();
    StudentDao studentDao = new StudentDaoImpl();

    private TableView<Student> studentTableView = new TableView<Student>();
    TableColumn idColumn = new TableColumn("Student Id");
    TableColumn nameColumn = new TableColumn("Student Name");
    TableColumn batchColumn = new TableColumn("Batch Name");

    @FXML
    public void initialize() {

        for(Student s: studentDao.getAllStudents()){
            students.add(s);
        }

        String names = "";
        studentTableView.getColumns().addAll(idColumn, nameColumn, batchColumn);

            idColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("stdId"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("stdName"));
            batchColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("stdBatch"));
        studentTableView.setItems(students);

            studentTableView.setMinWidth(200);
            studentTableView.setMaxHeight(100);
        pane.getChildren().add(studentTableView);

    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        Main.sceneLoader(root,"Main window");
    }
}
