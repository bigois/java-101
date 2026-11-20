package br.com.bigois.designpatterns.chainofresponsability;

import br.com.bigois.designpatterns.chainofresponsability.domain.Reimbursement;
import br.com.bigois.designpatterns.chainofresponsability.handler.Director;
import br.com.bigois.designpatterns.chainofresponsability.handler.Manager;
import br.com.bigois.designpatterns.chainofresponsability.handler.Supervisor;
import br.com.bigois.designpatterns.chainofresponsability.handler.core.ReimbursementHandler;
import br.com.bigois.designpatterns.chainofresponsability.service.ReimbursementService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

// This class is package-private to encapsulate the implementation details
// and prevent it from being accessed by classes outside its package
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class ChainOfResponsabilityApp {
	// The main method serves as the entry point for the application, so it is declared public
	public static void main(String[] args) {
		ReimbursementHandler approvementChain = new Supervisor(new Manager(new Director()));
		ReimbursementService service = new ReimbursementService(approvementChain);
		List<Reimbursement> requests = getReimbursementRequests();

		requests.forEach(service::process);
	}

	private static List<Reimbursement> getReimbursementRequests() {
		return List.of(
				new Reimbursement(new BigDecimal("500"), "Office supplies"),
				new Reimbursement(new BigDecimal("1500"), "Travel expenses"),
				new Reimbursement(new BigDecimal("6000"), "Server maintenance"),
				new Reimbursement(new BigDecimal("12000"), "Infrastructure upgrade"),
				new Reimbursement(new BigDecimal("25000"), "Equipment purchase")
		);
	}
}
