package com.example.Spring.Security.Demo.repository;

import com.example.Spring.Security.Demo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameUser(String userName);

}
