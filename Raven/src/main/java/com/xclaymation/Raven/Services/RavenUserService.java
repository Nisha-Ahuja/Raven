package com.xclaymation.Raven.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xclaymation.Raven.Repository.RavenUserRepository;
import com.xclaymation.Raven.entities.User;

@Service
public class RavenUserService {
	
	
	@Autowired
	private RavenUserRepository ravenUserRepository;
	
	List<User> users = Arrays.asList(
			new User("JassicaJohn@abc.com",858878,"JESSICA JOHN",1)
			);
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		ravenUserRepository.findAll().forEach(users::add);
		return users;
	}
	
	/*public User getUser(String emailId)
	{
		return ravenUserRepository.findById(emailId);
	}*/

}
