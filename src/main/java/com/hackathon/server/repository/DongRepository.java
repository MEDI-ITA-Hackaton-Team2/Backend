package com.hackathon.server.repository;

import com.hackathon.server.domain.Dong;
import com.hackathon.server.repository.Impl.DongRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DongRepository extends JpaRepository<Dong, Long>, DongRepositoryCustom {
}
