package com.xclaymation.Raven.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xclaymation.Raven.entities.User;

@Service
public class RavenUserService {
	
	
	List<User> users = Arrays.asList(
			new User("JassicaJohn@abc.com",1,"JESSICA JOHN")
			
			);

}
