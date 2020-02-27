package DAv.Features.LoginAuth.Domain;

import java.sql.PreparedStatement;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import static java.sql.Statement.RETURN_GENERATED_KEYS;


public class DavRepository {
	private final JdbcTemplate jdbcTemplate;

	
	public DavRepository(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	public User find(int id) {
		// need to research prepared statement setter
		return  (User) jdbcTemplate.query("SELECT * FROM tblUser WHERE UserId = ?",new Object[]{id},extractor);
	}
	
	public void createNewUser(String username, String password) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update( item -> {
			PreparedStatement statement = item.prepareStatement(
					"INSERT INTO tblUser (Username, Password) Values(?,?)",RETURN_GENERATED_KEYS
					);
			statement.setString(1,username);
			statement.setString(2,password);
			
			return statement;
				
		},keyHolder);
	}
	
	public void update(Integer id,String username, String password) {
		
		jdbcTemplate.update("UPDATE tblUser SET Username =  ? Password = ? WHERE id = ?",
				username, password, id);
		
	}
	
//	public void delete() {
//		
//	}
//	
	private final RowMapper<User> mapper = (rs,number) -> new User(
			rs.getString(2),
			rs.getString(3),
			rs.getInt(1)
			);
	
	private final ResultSetExtractor<Object> extractor = 
	//filling the result set Object rs 
	(rs) -> 
	//if result set has new row
	rs.next()? 
	//get rown from mapper
		mapper.mapRow(rs,1):
	//if not return null		
			null; 

}
