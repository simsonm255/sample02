package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springbootsample01Application {
		
	@RequestMapping("/hello")
	public String index() {
		return "<h2>Hello World</h2>";
	}
	public static void main(String[] args) {
		SpringApplication.run(Springbootsample01Application.class, args);
	}
}
