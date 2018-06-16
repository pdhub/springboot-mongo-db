package com.pritom.springboot.mongo.spingbootmongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDConfiguration {
}
