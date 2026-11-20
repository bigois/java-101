package br.com.bigois.designpatterns.chainofresponsability.handler;

import br.com.bigois.designpatterns.chainofresponsability.domain.Reimbursement;
import br.com.bigois.designpatterns.chainofresponsability.handler.core.AbstractReimbursementHandler;
import br.com.bigois.designpatterns.chainofresponsability.handler.core.ReimbursementHandler;
import lombok.NonNull;

import java.math.BigDecimal;

public class Manager extends AbstractReimbursementHandler {
	private static final BigDecimal APPROVAL_LIMIT = new BigDecimal("5000");

	public Manager(ReimbursementHandler next) {
		super(next);
	}

	public Manager() {
		super();
	}

	@Override
	protected boolean canApprove(@NonNull Reimbursement reimbursement) {
		return reimbursement.amount().compareTo(APPROVAL_LIMIT) <= 0;
	}

	@Override
	protected void approve(@NonNull Reimbursement reimbursement) {
		System.out.println("> manager approved the reimbursement");
	}
}
