package com.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
