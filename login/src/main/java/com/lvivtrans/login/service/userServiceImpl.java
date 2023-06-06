package com.lvivtrans.login.service;

import com.lvivtrans.login.model.user;
import com.lvivtrans.login.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public user saveUser(user user) {
        return userRepository.save(user);
    }

    @Override
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public user findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
       userRepository.deleteById(id);
    }
}
