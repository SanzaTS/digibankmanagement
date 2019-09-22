package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Customer;
import service.CustomerEJB;

@ManagedBean(name="customercontroller")
@SessionScoped
public class CustomerController {
	
	@EJB
	CustomerEJB customerservice;
	
	@ManagedProperty(value="#(customer)")
	private Customer customer;
	
	
	public void addNewCustomer()
	{
		System.out.println("Its working");
		customerservice.addNew(customer.getEntity());
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
   
}
