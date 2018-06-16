package com.pritom.springboot.mongo.spingbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
