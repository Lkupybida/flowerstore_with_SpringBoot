package ua.edu.ucu.apps.flowerstore.spring;
import ua.edu.ucu.apps.flowerstore.spring.FlowerController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}

}
