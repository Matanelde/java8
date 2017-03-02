package java8;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping(value = "/users/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody()
	public List<User> getUsers(){
		User user1 = new User("bibi", "netanyahu", 67);
		User user2 = new User("buji", "hertzog", 65);
		User user3 = new User("naftali", "bennet", 45);
		return Arrays.asList(user1, user2, user3);
	}
	
	
	@RequestMapping(value = "/users/add", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody()
	public void addUser(@RequestBody User user){
		System.out.println(user);
	}

}
