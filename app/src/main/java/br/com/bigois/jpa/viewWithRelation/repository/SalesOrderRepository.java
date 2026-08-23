package br.com.bigois.jpa.viewWithRelation.repository;

import br.com.bigois.jpa.viewWithRelation.entity.SalesOrder;
import br.com.bigois.jpa.viewWithRelation.id.SalesOrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, SalesOrderId> {
}
