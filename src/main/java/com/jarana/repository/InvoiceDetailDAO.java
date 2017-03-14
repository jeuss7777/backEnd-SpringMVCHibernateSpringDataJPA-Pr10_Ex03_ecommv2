package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.InvoiceDetail;
import com.jarana.entities.InvoiceDetailId;

@Repository("invoicedetailDAO")
public interface InvoiceDetailDAO extends JpaRepository<InvoiceDetail, InvoiceDetailId> {

	 List<InvoiceDetail> findByid(InvoiceDetailId id);
}
