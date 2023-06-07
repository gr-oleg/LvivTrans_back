package com.lvivtrans.login.service;

import com.lvivtrans.login.model.user;
import java.util.List;

public interface userService {
    public user saveUser(user user);
    List<user> getAllUsers();
    user findByEmail(String email);
}
