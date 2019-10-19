package com.scl.online.autoservice.service;


import com.scl.online.autoservice.domain.User;
import com.scl.online.autoservice.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserServiceImpl implements UserService {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @Override
    public void create(User user) {
        User existing = userDao.findByUsername(user.getUsername());
        Assert.isNull(existing, "user already exists: " + user.getUsername());
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);

    }
}
