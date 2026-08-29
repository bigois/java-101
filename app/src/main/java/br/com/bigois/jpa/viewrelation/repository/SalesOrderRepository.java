package br.com.bigois.jpa.viewrelation.repository;

import br.com.bigois.jpa.viewrelation.entity.SalesOrder;
import br.com.bigois.jpa.viewrelation.id.SalesOrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, SalesOrderId> {
}
