package com.walmiralves.workshopdemo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.walmiralves.workshopdemo.domain.Post;



@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
