package DAv;

import DAv.Features.LoginAuth.Domain.LoginResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		exclude = {
			    DataSourceAutoConfiguration.class
			}
		)

public class DAvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DAvApplication.class, args);

	}

}
