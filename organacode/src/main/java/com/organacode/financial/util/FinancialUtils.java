package com.organacode.financial.util;

import com.organacode.financial.service.FinancialService;

public class FinancialUtils {
	public void startApp() {
		FinancialService service = new FinancialService();
		System.out.println(service.buildMessage("FinancialUtils"));
	}
}
