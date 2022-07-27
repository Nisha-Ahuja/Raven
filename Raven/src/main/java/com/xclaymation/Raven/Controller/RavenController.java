package com.xclaymation.Raven.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xclaymation.Raven.Services.RavenUserService;
// import com.xclaymation.Raven.Services.LoginService;



@RestController
public class RavenController {
	// private LoginService service;
	
	@Autowired	
	private RavenUserService ravenUserService;
	
	@GetMapping({"/","/index"})
	public String Index() {
		return "index" ;
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Raven Home Page";
		
	}
	
	@GetMapping("/User")
	public String getAllUsers() {
		return "hello";
		//return ravenService.getAllUsers();
	}
	
	@GetMapping("/User/{id}")
	public String getUserByEmailId(@PathVariable String id) {
		return "hello";
		//return ravenService.getUserById(id);
	}
	
	/*@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailID = user.getEmailID();
		String tempPassword = user.getPassword();
		User userObj = null;
		if(tempEmailID != null && tempPassword != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailID, tempPassword);
			
		}
		try {
			if(userObj == null)
			{
				throw new Exception("Bad Credentials");
			}
			else
			{
				//bring User Information here
				 // userInfoObj
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userObj;
		
		// sending emPId to db and receive the user information from db
		
	} */
		
	//get the completedCourses
	
	
	
	

}
