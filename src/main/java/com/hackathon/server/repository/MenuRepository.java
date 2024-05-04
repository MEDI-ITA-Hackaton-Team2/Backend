package com.hackathon.server.repository;

import com.hackathon.server.domain.Menu;
import com.hackathon.server.repository.Impl.MenuRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>, MenuRepositoryCustom {
}
