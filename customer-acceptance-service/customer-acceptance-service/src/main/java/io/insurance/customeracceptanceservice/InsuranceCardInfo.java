package io.insurance.customeracceptanceservice;


public class InsuranceCardInfo {
	
	
	private Customer customer;
	private String coverageType;
	private String coverageDetails;
	private double monthlyCost;
	private String coverageDate;
	private String acceptOrDenied;
	
	
	public InsuranceCardInfo(Customer customer, String coverageType, String coverageDetails, double monthlyCost,
			String coverageDate, String acceptOrDenied) {
		super();
		this.customer = customer;
		this.coverageType = coverageType;
		this.coverageDetails = coverageDetails;
		this.monthlyCost = monthlyCost;
		this.coverageDate = coverageDate;
		this.acceptOrDenied = acceptOrDenied;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getCoverageDetails() {
		return coverageDetails;
	}
	public void setCoverageDetails(String coverageDetails) {
		this.coverageDetails = coverageDetails;
	}
	public double getMonthlyCost() {
		return monthlyCost;
	}
	public void setMonthlyCost(float monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	public String getCoverageDate() {
		return coverageDate;
	}
	public void setCoverageDate(String coverageDate) {
		this.coverageDate = coverageDate;
	}
	public String getAcceptOrDenied() {
		return acceptOrDenied;
	}
	public void setAcceptOrDenied(String acceptOrDenied) {
		this.acceptOrDenied = acceptOrDenied;
	}
	
	
	


}
