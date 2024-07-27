package na.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Component
public class Add1Application {
	public String msg() {
		return "Wecome to spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(Add1Application.class, args);
		Add1Application msg1 = new Add1Application();
		System.out.println(msg1.msg());
		
	}

}
