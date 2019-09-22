package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="customer")
@SessionScoped
public class Customer {
    
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private int accountNumber;
	private Double amount;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name ="sanele sithole";
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public CustomerEntity getEntity()
	{
		CustomerEntity customerentity =new CustomerEntity();
		customerentity.setName(name);
		customerentity.setSourcePassport(sourcePassport);
		customerentity.setDestinationPassport(destinationPassport);
		customerentity.setDestinationBank(destinationBank);
		customerentity.setDestinationCountry(destinationCountry);
		customerentity.setAccountNumber(accountNumber);
		customerentity.setAmount(amount);
		
		return customerentity;
	}
	
}
