package com.sebastien.ecocompo.service;

import com.sebastien.ecocompo.entity.User;

import com.sebastien.ecocompo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
/*    @Autowired
    UserMapper userMapper;*/

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long userId) throws Exception {
  return  userRepository.findById(userId).orElseThrow(() -> new Exception("User not found with ID: " + userId));


    }
}
