/**
 * 
 */
package com.poc.shoppingcart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

import com.poc.shoppingcart.enums.OrderStates;

import lombok.Data;

/**
 * @author Sayanta.Ganguly
 *
 */

@Entity(name = "ORDERS")
@Data
@Proxy(lazy=false)
public class Order {
	@Id
	@Column(name = "ORDER_ID")
	private Long id;

	@Column(name = "DATE_TIME")
	private Date datetime;

	@Column(name = "STATE")
	private String state;

	
	
	public Order() {
	}

	public Order(Date d, OrderStates os) {
		this.datetime = d;
		this.setOrderState(os);
		this.id=new Long(123213);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * public Date getDatetime() { return datetime; }
	 * 
	 * public void setDatetime(Date datetime) { this.datetime = datetime; }
	 */

	public OrderStates getOrderState() {
		return OrderStates.valueOf(this.state);
	}

	public void setOrderState(OrderStates s) {
		this.state = s.name();
	}

}
