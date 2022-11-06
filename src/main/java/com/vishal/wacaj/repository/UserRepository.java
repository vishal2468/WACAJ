package com.vishal.wacaj.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.wacaj.model.security.User;

public interface UserRepository extends MongoRepository<User,Integer>{
     Optional<User> findByUserName(String userName);
}
