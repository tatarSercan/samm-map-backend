package com.sercan.sammmapbackend.repository;

import com.sercan.sammmapbackend.model.CoordinateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepository extends JpaRepository<CoordinateEntity, Integer> {
}
