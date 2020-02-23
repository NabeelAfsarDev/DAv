package DAv.Features.LoginAuth.Domain;

import javax.sql.DataSource;
//import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.beans.factory.annotation.Autowired;

public class DavRepository {
	//JdbcTemplate jdbcTemplate = new JdbcTemplate();
	@Autowired
	public DataSource Datasoure;
	
	public String find(String id) {
		
		return"";
	}
	
	public void create() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
