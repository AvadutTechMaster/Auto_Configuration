package in.ashokit.autoconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoConfiguration {

	public AutoConfiguration() {
		System.out.println("Constructor");
	}

	@GetMapping("/")
	public String data() {
		return "Welcome to SpringBoot";
	}

}
