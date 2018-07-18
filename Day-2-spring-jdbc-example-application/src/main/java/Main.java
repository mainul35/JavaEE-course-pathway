import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Main {

    public static DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/test",
//                "root",
//                "");
//
//        PreparedStatement pstmt = connection.prepareStatement("select * from student");
//        ResultSet rs = pstmt.executeQuery();
//
//        while (rs.next()){
//            System.out.println(rs.getInt("std_id"));
//            System.out.println(rs.getString("std_name"));
//            System.out.println(rs.getString("std_batch"));
//        }


        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        System.out.println(jdbcTemplate.queryForList("SELECT * FROM student").toString());
    }

}
