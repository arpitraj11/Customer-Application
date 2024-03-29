package com.geekster.CustomerApplication.service;

import com.geekster.CustomerApplication.model.User;
import com.geekster.CustomerApplication.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public List<User> getUsers(){
        return userRepo.findAll();
    }
    public String addUser(User user){
        userRepo.save(user);
        return "User Created !!";
    }
}
