package com.pritom.springboot.mongo.spingbootmongo.resource;

import com.pritom.springboot.mongo.spingbootmongo.document.User;
import com.pritom.springboot.mongo.spingbootmongo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/mongoUser")
public class UserResource {

    private UserRepository userRepository;

    //Since spring 4 we do not need autowire
    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
