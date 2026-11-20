package br.com.bigois.designpatterns.chainofresponsability.service;

import br.com.bigois.designpatterns.chainofresponsability.domain.Reimbursement;
import br.com.bigois.designpatterns.chainofresponsability.handler.core.ReimbursementHandler;
import lombok.NonNull;

public class ReimbursementService {
	private final ReimbursementHandler approvementChain;

	public ReimbursementService(@NonNull ReimbursementHandler approvementChain) {
		this.approvementChain = approvementChain;
	}

	public void process(@NonNull Reimbursement reimbursement) {
		approvementChain.process(reimbursement);
	}
}
