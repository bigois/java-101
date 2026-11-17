package br.com.bigois.jpms;

import com.organacode.financial.util.FinancialUtils;

// Experiment: uncomment this import and the two lines below, then compile
// import com.organacode.financial.service.FinancialService;

public class JPMSApp {
	public static void main(String[] args) {
		// Allowed: FinancialUtils belongs to an exported package
		FinancialUtils financial = new FinancialUtils();
		financial.startApp();

		// Blocked: this package is not exported by com.organacode
		// FinancialService service = new FinancialService();
		// System.out.println(service.buildMessage("JPMSApp"));
	}
}
