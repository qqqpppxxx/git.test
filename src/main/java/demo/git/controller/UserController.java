package demo.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import demo.git.Application;
import demo.git.UserService;
import demo.git.entity.User;


@RestController
public class UserController {
	
	
		
//	@RequestMapping("/")
//	public String startService() {
//		return "instruction";
//}
	
//	@RequestMapping(value = "/user/info",method = RequestMethod.GET)
//	public User getUserInfo() {
//	  return new User();
//	}
	
//	@RequestMapping(value = "/{user}/info}", method = RequestMethod.GET)
//	public String findUser(@PathVariable String user, Model model) {
//		User user = ;// tutaj user z jsona (?)
//		model.addAttribute("user", user);
//		return "userInfo"; // tutaj zwracałem widok, ale mogę po prostu new User()
//	}
	
	@RequestMapping(value = "/{user}/info", method = RequestMethod.GET)
	public User findUser(@PathVariable String user) throws Exception {
		
		return UserService.getInfo(user);
	}
//	
//	
}
