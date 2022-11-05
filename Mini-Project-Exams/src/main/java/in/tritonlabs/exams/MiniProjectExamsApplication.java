package in.tritonlabs.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("in.tritonlabs.exams")
@EntityScan("in.tritonlabs.exams.entity")
@EnableJpaRepositories("in.tritonlabs.exams.repository")
public class MiniProjectExamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectExamsApplication.class, args);
		System.out.println("START EXAMS");
	}

}
