package com.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
