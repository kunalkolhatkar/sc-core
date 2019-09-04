package com.secretchat.sccore.manager;

import com.secretchat.sccore.entity.Account;
import com.secretchat.sccore.entity.User;
import com.secretchat.sccore.exception.ResourceNotFoundException;
import com.secretchat.sccore.repository.AccountRepository;
import com.secretchat.sccore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserManager {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;


    public User getUser(String userId){
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent())
            return user.get();
        else
            throw new ResourceNotFoundException("Couldn't locate User with Id" + userId);
    }

    public void createUser(){

        String username = "";
        String password = "";

        User user = new User();
        user.setVerified(false);
        user.setDeleted(false);
        user.setActive(true);
        user.setUserId(username);
        user.setPass(password);

        Account account = new Account();
        account.setUserId(user.getUserId());

        user.setAccount(account);

        accountRepository.save(account);
        userRepository.save(user);

    }


}
