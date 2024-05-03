package com.hackathon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMemberRepository extends JpaRepository<OrderMemberRepository, Long> {
}
