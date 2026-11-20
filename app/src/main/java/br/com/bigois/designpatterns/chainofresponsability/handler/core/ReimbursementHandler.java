package br.com.bigois.designpatterns.chainofresponsability.handler.core;

import br.com.bigois.designpatterns.chainofresponsability.domain.Reimbursement;
import lombok.NonNull;

public interface ReimbursementHandler {
	void process(@NonNull Reimbursement reimbursement);
}
