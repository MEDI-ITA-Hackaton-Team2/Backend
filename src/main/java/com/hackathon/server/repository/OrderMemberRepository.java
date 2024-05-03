package com.hackathon.server.repository;

import com.hackathon.server.domain.OrderMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMemberRepository extends JpaRepository<OrderMember, Long> {
}
