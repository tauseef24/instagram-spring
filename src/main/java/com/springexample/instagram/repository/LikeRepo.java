package com.springexample.instagram.repository;

import com.springexample.instagram.model.Likes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepo extends MongoRepository<Likes, String> {
}
