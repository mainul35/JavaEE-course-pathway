import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    public static DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

    public Student getStudentById(int id) {
        return null;
    }

    public List<Student> getAllStudents() {
        return jdbcTemplate.query("SELECT * FROM student", new StudentMapper());
    }

    public void addStudent(Student student) {
        jdbcTemplate.update("INSERT INTO student(std_id, std_name, std_batch) VALUES (?,?,?); ", student.getStdId(), student.getStdName(), student.getStdBatch());
    }
}
