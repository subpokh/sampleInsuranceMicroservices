package io.insurance.customeracceptanceservice;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerAddress;
	private Quote quote;
	private int customerAgeYears;
	
	
	public Customer(String customerId, String customerName, String customerAddress, Quote quote,
			int customerAgeYears) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.quote = quote;
		this.customerAgeYears = customerAgeYears;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerAgeYears() {
		return customerAgeYears;
	}
	public void setCustomerAgeYears(int customerAgeYears) {
		this.customerAgeYears = customerAgeYears;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	
	
	
	
	
	
	

}
