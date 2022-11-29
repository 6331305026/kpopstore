package com.mfu.kpopmart_backend.repository;

import com.mfu.kpopmart_backend.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

  List<Order> findById(long id);
}