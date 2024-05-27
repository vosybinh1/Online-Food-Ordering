package com.binh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.binh.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
	
}
