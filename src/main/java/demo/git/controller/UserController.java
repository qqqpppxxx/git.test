package demo.git.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
	
	
	@GetMapping("/")
	public String startService() {
		return "instruction";
}
	
	@RequestMapping(value = "/{user}/info}", method = RequestMethod.GET)
	public String findUser(@PathVariable String user, Model model) {
		User user = ;// tutaj user z jsona
		model.addAttribute("user", user);
		return "userInfo";
	}
	
	
}
