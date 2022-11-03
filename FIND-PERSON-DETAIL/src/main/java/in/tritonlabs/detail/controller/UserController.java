package in.tritonlabs.detail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.detail.entity.User;
import in.tritonlabs.detail.service.impl.UserServiceImpl;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/")
	public List<User> ReadAll(){
		return userService.ReadAll();
	}
	
}
