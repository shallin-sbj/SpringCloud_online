package com.scl.online.serviceauthhi.repository;

import com.scl.online.serviceauthhi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
