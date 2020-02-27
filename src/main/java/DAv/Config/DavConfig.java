package DAv.Config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import com.microsoft.sqlserver.jdbc;

import DAv.Features.LoginAuth.Domain.DavRepository;


@Configuration
public class DavConfig {

	@Bean
	public DataSource  getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create()
		return dataSourceBuilder.build();
	}
	
	@Bean
	public DavRepository getDavRepository() {
		return new DavRepository(getDataSource());
	}
	
//	@Bean
//	public SQLServerDataSource getDatasource() {
//		
//	}
}

