package br.com.bigois.jpa.viewrelation;

import br.com.bigois.jpa.viewrelation.entity.SalesOrder;
import br.com.bigois.jpa.viewrelation.repository.SalesOrderRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ViewWithRelationApp implements ApplicationRunner {
	private final SalesOrderRepository salesOrderRepository;

	public ViewWithRelationApp(SalesOrderRepository salesOrderRepository) {
		this.salesOrderRepository = salesOrderRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ViewWithRelationApp.class, args);
	}

	@Override
	public void run(@NonNull ApplicationArguments args) {
		List<SalesOrder> salesOrders = salesOrderRepository.findAll();
		System.out.println("Total sales orders: " + salesOrders.size());
		System.out.println(salesOrders);
	}
}
