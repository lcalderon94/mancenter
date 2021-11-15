package com.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
