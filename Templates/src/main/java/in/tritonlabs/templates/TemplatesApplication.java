package in.tritonlabs.templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("in.tritonlabs.templates")
@EntityScan("in.tritonlabs.templates.entity")
@EnableJpaRepositories("in.tritonlabs.templates.repository")
public class TemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplatesApplication.class, args);
		System.out.println("START TEMPLATES");
	}

}
