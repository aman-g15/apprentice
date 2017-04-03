package org.bank.aman.rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bank.aman.entities.RegularCustomer;
import org.bank.aman.rest.Banking;
@Path("/bank")
public class BankingImpl implements Banking{

	private RegularCustomer customer;
	public BankingImpl(){
		customer = new RegularCustomer(1001);
		customer.setCustomerName("Raja Babu");
		customer.setUsername("rajababu");
		customer.setPassword("1234");
	}
	
	@Path("/name")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getName() {
		// TODO Auto-generated method stub
		return "{name:"+customer.customerName()+"}";
	}

}
