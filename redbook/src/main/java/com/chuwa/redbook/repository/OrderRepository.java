package com.chuwa.redbook.repository;

import com.chuwa.redbook.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
