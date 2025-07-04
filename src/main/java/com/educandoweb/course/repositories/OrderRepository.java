package com.educandoweb.course.repositories;

import com.educandoweb.course.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
