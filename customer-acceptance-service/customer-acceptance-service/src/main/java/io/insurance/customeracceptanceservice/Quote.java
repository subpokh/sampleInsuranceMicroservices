package io.insurance.customeracceptanceservice;

public class Quote {
	
	private String quoteId;
	private String quoteCoverage;
	private String quoteDescription;
	
	
	public Quote(String quoteId, String quoteCoverage, String quoteDescription) {
		super();
		this.quoteId = quoteId;
		this.quoteCoverage = quoteCoverage;
		this.quoteDescription = quoteDescription;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuoteCoverage() {
		return quoteCoverage;
	}
	public void setQuoteCoverage(String quoteCoverage) {
		this.quoteCoverage = quoteCoverage;
	}
	public String getQuoteDescription() {
		return quoteDescription;
	}
	public void setQuoteDescription(String quoteDescription) {
		this.quoteDescription = quoteDescription;
	}
	
}
