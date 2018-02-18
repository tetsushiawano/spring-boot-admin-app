package awano.tetsushi.springbootadminapp;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminAppApplication.class, args);
	}
}
