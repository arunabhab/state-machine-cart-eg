/**
 * 
 */
package com.poc.shoppingcart.entity;

import java.io.Serializable;
import java.security.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ArunabhaB
 *
 */

@Getter
@Setter
@ToString
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "CUST_ID")
	private Integer custId;
	
	@Column (name = "CUST_NAME")
	private String custName;

	public Customer() {

	}

	public Customer(Integer custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	
	
}
