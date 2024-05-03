package com.hackathon.server.repository;

import com.hackathon.server.domain.Dong;
import com.hackathon.server.dto.DongRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DongRepository extends JpaRepository<Dong, Long> {
    List<DongRes> getAll();
}
