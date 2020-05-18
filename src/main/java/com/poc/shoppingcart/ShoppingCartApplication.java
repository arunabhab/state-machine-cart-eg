package com.poc.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ArunabhaB
 *
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.poc.shoppingcart.repository")
@EntityScan(basePackages = "com.poc.shoppingcart.entity")
public class ShoppingCartApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShoppingCartApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
