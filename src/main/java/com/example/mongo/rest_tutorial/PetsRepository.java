package com.example.mongo.rest_tutorial;

import com.example.mongo.rest_tutorial.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface PetsRepository extends MongoRepository<Pets, String> {
  Pets findBy_id(ObjectId _id);
}
