package com.poc.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.shoppingcart.entity.Cart;
import com.poc.shoppingcart.entity.CartTemp;

/**
 * @author ArunabhaB
 *
 */

public interface CartRepository extends JpaRepository<CartTemp, Object> {
	
}
