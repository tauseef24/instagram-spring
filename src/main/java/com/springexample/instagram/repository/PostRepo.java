package com.springexample.instagram.repository;

import com.springexample.instagram.model.Posts;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Posts, String> {
}
