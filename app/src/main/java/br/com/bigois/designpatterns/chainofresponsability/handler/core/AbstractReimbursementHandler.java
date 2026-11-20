package br.com.bigois.designpatterns.chainofresponsability.handler.core;

import br.com.bigois.designpatterns.chainofresponsability.domain.Reimbursement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.text.NumberFormat;
import java.util.Locale;

// force = true is used to initialize final fields with default values
@NoArgsConstructor(force = true)
@AllArgsConstructor
public abstract class AbstractReimbursementHandler implements ReimbursementHandler {
	private final ReimbursementHandler next;
	private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

	protected abstract boolean canApprove(@NonNull Reimbursement reimbursement);

	protected abstract void approve(@NonNull Reimbursement reimbursement);

	@Override
	public void process(@NonNull Reimbursement reimbursement) {
		if (canApprove(reimbursement)) {
			printReimbursementDetails(reimbursement);
			approve(reimbursement);
		} else if (next != null) {
			next.process(reimbursement);
		} else {
			printReimbursementDetails(reimbursement);
			System.out.println("> reimbursement request rejected");
		}
	}

	private void printReimbursementDetails(@NonNull Reimbursement reimbursement) {
		System.out.println(reimbursement.description()
				+ " (" + currencyFormat.format(reimbursement.amount()) + ")");
	}
}
