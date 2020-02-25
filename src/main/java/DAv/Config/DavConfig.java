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
				.url("jdbc:sqlserver://meetupdav.database.windows.net:1433;database=DavDB;user=nadeveloper786@meetupdav;password=Scarface.Dav22;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
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

