import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);

    List<Student> getAllStudents();

    void addStudent(Student student);
}
