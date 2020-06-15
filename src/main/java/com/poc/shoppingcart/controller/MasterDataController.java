package com.poc.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.shoppingcart.entity.Customer;
import com.poc.shoppingcart.entity.Item;
import com.poc.shoppingcart.service.CustomerMgmtService;
import com.poc.shoppingcart.service.ItemService;

/**
 * @author ArunabhaB
 *
 */

@Controller
@RequestMapping("/masterdata")
public class MasterDataController {


	
	@Autowired
	ItemService itemService;
	
	@Autowired
	CustomerMgmtService customerMgmtService;

	

	@ResponseBody
	@RequestMapping(value = "/getItems", method = RequestMethod.GET,produces={"application/json","application/xml"})
	public List<Item> getString() throws Exception {
		List<Item> items=itemService.getItemList();
		return items;

	}
	
	
//	@ResponseBody
//	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)

	public Integer createCustomer(Customer customer) throws Exception {
		customerMgmtService.putData(customer);
		return 1;

	}
	
	@RequestMapping(value = "/getPage", method = RequestMethod.GET)
	public String getPage() throws Exception {
		return "upload";

	}


}
