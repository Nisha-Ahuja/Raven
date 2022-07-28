package com.xclaymation.Raven.Repository;

import org.springframework.data.repository.CrudRepository;

import com.xclaymation.Raven.entities.User;

public interface RavenUserRepository extends CrudRepository<User,String>{

	//getUser(String emailId);
}
