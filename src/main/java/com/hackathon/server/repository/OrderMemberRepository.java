package com.hackathon.server.repository;

import com.hackathon.server.domain.OrderMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMemberRepository extends JpaRepository<OrderMember, Long> {

    List<OrderMember> findByOrderOrderId(Long orderId);
}
