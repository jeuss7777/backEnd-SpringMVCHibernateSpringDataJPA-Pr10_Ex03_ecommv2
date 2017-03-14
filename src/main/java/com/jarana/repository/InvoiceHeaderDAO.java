package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Customer;
import com.jarana.entities.InvoiceHeader;

@Repository("invoiceheaderDAO")
public interface InvoiceHeaderDAO extends JpaRepository<InvoiceHeader, Long> {

	 public List<InvoiceHeader> findByihInvNb(Long ihInvNb);
	 
	 @Query("Select ih1 FROM invoiceheader ih1 INNER JOIN FETCH ih1.customer INNER JOIN FETCH ih1.invoicedetail WHERE ih1.saInvoiceNumber = :ihInvNb")
	 public InvoiceHeader findOneDet(@Param("ihInvNb") Long ihInvNb);
	 
	 public List<InvoiceHeader> findBycustomer(Customer customer);
}
