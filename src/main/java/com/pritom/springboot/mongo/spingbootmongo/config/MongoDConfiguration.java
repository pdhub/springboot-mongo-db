package com.pritom.springboot.mongo.spingbootmongo.config;

import com.pritom.springboot.mongo.spingbootmongo.document.User;
import com.pritom.springboot.mongo.spingbootmongo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDConfiguration {

    CommandLineRunner commandLineRunner (UserRepository userRepository){
        return args -> {
            userRepository.save(new User(1, "Peter", "Google", 1200L));
            userRepository.save(new User(1, "Sam", "Facebook", 1800L));
        };
    }
}
