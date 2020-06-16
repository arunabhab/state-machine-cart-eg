package com.poc.shoppingcart;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.statemachine.StateMachine;

import com.poc.shoppingcart.controller.MasterDataController;
import com.poc.shoppingcart.entity.Customer;
import com.poc.shoppingcart.enums.Events;
import com.poc.shoppingcart.enums.States;
import com.poc.shoppingcart.service.CustomerMgmtService;

/**
 * @author ArunabhaB
 *
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.poc.shoppingcart.repository")
@EntityScan(basePackages = "com.poc.shoppingcart.entity")
public class ShoppingCartApplication extends SpringBootServletInitializer 
implements CommandLineRunner {

	@Autowired
	private StateMachine<States, Events> myStateMachine;
	
	@Autowired
	CustomerMgmtService custMgmtService;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShoppingCartApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}
	
	public static Customer createCustomerObj(String name) {
		Customer customer = new Customer();
		Random rd = new Random();
		customer.setCustId(rd.nextInt());
		customer.setCustName(name);
		return customer;
	}

	@Override
	public void run(String... args) throws Exception {
		myStateMachine.sendEvent(Events.E1);
		myStateMachine.sendEvent(Events.E2);
		
		System.out.println("Before master controller");
//		MasterDataController masterController = new MasterDataController();
		try {
			System.out.println("inside try catch");
		custMgmtService.putData(createCustomerObj("Sayanta"));
		System.out.println("inside try catch but after method");

		}catch(Exception ex) {
			System.out.println("Could not save customer : "+ex);
			ex.printStackTrace();
		}
		

	}
}
