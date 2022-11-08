package in.tritonlabs.student.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("in.tritonlabs.student.exams")
@EntityScan("in.tritonlabs.student.exams.entity")
@EnableJpaRepositories("in.tritonlabs.student.exams.repository")
public class StudentExamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentExamsApplication.class, args);
		System.out.println("START STUDENT EXAMS");
	}

}
