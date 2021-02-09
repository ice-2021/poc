package com.ice.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ice.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
