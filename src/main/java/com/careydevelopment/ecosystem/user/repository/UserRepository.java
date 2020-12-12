package com.careydevelopment.ecosystem.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.careydevelopment.ecosystem.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
}
