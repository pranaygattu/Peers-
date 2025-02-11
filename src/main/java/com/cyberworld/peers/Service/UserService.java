package com.cyberworld.peers.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.cyberworld.peers.Reposiotry.UserRepository;
import com.cyberworld.peers.model.Users;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users createUserService(Users users) {
        return userRepository.save(users);
    }
}
