package in.tritonlabs.detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("in.tritonlabs.detail")
@EntityScan("in.tritonlabs.detail.entity")
@EnableJpaRepositories("in.tritonlabs.detail.repository")
public class FindPersonDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindPersonDetailApplication.class, args);
		System.out.println("START FIND PERSON DETAIL");
	}

}
