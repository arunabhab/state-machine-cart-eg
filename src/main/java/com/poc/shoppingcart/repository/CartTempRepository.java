package com.poc.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.shoppingcart.entity.Cart;

/**
 * @author ArunabhaB
 *
 */

public interface CartTempRepository extends JpaRepository<Cart, Object> {
	
}
