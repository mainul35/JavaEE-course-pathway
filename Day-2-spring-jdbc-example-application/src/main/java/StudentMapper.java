import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setStdId(resultSet.getInt("std_id"));
        student.setStdName(resultSet.getString("std_name"));
        student.setStdBatch(resultSet.getString("std_batch"));
        return student;
    }
}
