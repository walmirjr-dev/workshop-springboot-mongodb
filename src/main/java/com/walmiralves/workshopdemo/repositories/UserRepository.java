package com.walmiralves.workshopdemo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.walmiralves.workshopdemo.domain.User;



@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
