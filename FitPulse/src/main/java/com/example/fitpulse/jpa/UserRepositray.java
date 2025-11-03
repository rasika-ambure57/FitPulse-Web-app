package com.example.fitpulse.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fitpulse.entity.User;

@Repository
public interface UserRepositray extends JpaRepository<User, Integer> {
}
