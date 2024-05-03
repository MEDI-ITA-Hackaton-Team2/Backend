package com.hackathon.server.repository;

import com.hackathon.server.domain.Dong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DongRepository extends JpaRepository<Dong, Long> {
}
