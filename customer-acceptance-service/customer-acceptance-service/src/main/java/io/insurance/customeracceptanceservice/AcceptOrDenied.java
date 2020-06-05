package io.insurance.customeracceptanceservice;

public class AcceptOrDenied {
	
	private int numberOfAccidents;
	private String severityOfAccidents;
	private int yearsSinceLastAccident;
	private int ageYear;
	
	
	
	
	public AcceptOrDenied(int numberOfAccidents, String severityOfAccidents, int yearsSinceLastAccident, int ageYear) {
		super();
		this.numberOfAccidents = numberOfAccidents;
		this.severityOfAccidents = severityOfAccidents;
		this.yearsSinceLastAccident = yearsSinceLastAccident;
		this.ageYear = ageYear;
	}

	public String getAcceptance() {
		String acceptance = "";
		if(this.getNumberOfAccidents() < 10 && this.getSeverityOfAccidents() == "non-fatal" && this.yearsSinceLastAccident>1 && this.ageYear> 18) {
			acceptance = acceptance + "ACCEPTED";
		}
		else
			acceptance = acceptance + "DENIED";
		return acceptance;
	}
	
	public int getNumberOfAccidents() {
		return numberOfAccidents;
	}
	public void setNumberOfAccidents(int numberOfAccidents) {
		this.numberOfAccidents = numberOfAccidents;
	}
	public String getSeverityOfAccidents() {
		return severityOfAccidents;
	}
	public void setSeverityOfAccidents(String severityOfAccidents) {
		this.severityOfAccidents = severityOfAccidents;
	}
	public int getYearsSinceLastAccident() {
		return yearsSinceLastAccident;
	}
	public void setYearsSinceLastAccident(int yearsSinceLastAccident) {
		this.yearsSinceLastAccident = yearsSinceLastAccident;
	}
	public int getAgeYear() {
		return ageYear;
	}
	public void setAgeYear(int ageYear) {
		this.ageYear = ageYear;
	}
	
	

}
