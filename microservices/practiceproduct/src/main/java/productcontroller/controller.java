package productcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class controller {

	@GetMapping("/n")
	public String name() {
		return "I am Lakshmikutty";
	}
//	@GetMapping("/job")
//	public String job() {
//		return "I am an engineer";
//	}
//	@GetMapping("/place")
//	public String place() {
//		return "Delhi";
//	}
}
