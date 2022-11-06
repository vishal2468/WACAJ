package com.vishal.wacaj;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer>{
     Optional<User> findByUserName(String userName);
}
