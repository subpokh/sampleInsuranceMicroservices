package io.insurance.customeracceptanceservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualify")
public class CustomerAcceptanceServiceController {
	
	@RequestMapping("/{customerId}")
	public List<InsuranceCardInfo> gerInsuranceInfo(String customerId){
		

		 
		AcceptOrDenied aod = new AcceptOrDenied(3, "non-fatal", 2, 17);
		Quote quote = new Quote("Q200", "Liability", "abc");
		Customer customer = new Customer("C101", "John Doe","101 N Wilson Dr.", quote, 28);
		InsuranceCardInfo info = new InsuranceCardInfo(customer,"Liability","abc", 25, "10/12/2020", aod.getAcceptance());
		
		return Collections.singletonList(info);
	} 

}