package springcore;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper6 implements RowMapper<person6> {
    @Override
    public person6 mapRow(ResultSet rs, int rowNum) throws SQLException {
        person6 person = new person6();
        person.setId(rs.getInt("id"));
        person.setAge(rs.getInt("age"));
        person.setFirstName(rs.getString("first_name"));
        person.setLastName(rs.getString("last_name"));
        return person;
    }
}
