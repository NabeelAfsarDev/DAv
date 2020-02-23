package DAv.Config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DavConfig {

	@Bean
	public DataSource  getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create()
				.url("jdbc:sqlserver://meetup.database.windows.net:1433;database=Dav;user=nadeveloper@meetup;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;")
				.username("b1ed2f278da28f")
				.password("cf0cf839");
		return dataSourceBuilder.build();
	}
}

