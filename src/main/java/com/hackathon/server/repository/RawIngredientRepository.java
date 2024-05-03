package com.hackathon.server.repository;

import com.hackathon.server.domain.RawIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawIngredientRepository extends JpaRepository<RawIngredient, Long> {
}
