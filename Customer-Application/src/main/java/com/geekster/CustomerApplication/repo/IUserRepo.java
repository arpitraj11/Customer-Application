package com.geekster.CustomerApplication.repo;

import com.geekster.CustomerApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {
    public Optional<User> findByEmail(String email);
}
