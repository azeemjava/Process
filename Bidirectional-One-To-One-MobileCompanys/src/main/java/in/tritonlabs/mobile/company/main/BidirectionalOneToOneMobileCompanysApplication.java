package in.tritonlabs.mobile.company.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("in.tritonlabs.mobile.company")
@EntityScan("in.tritonlabs.mobile.company.entity")
@EnableJpaRepositories("in.tritonlabs.mobile.company.repository")
public class BidirectionalOneToOneMobileCompanysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidirectionalOneToOneMobileCompanysApplication.class, args);
		System.out.println("START SERVER");
		
	}

}
