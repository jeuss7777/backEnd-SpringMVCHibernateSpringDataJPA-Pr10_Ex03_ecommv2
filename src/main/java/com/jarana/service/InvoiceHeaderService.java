package com.jarana.service;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.jarana.entities.Customer;
import com.jarana.entities.InvoiceHeader;
public interface InvoiceHeaderService {
	public List<InvoiceHeader> findAll();
	
	public InvoiceHeader findOne(Long ihInvNb);
	public InvoiceHeader findOneDet(@Param("ihInvNb") Long ihInvNb);
	
	public List<InvoiceHeader> findBycustomer(Customer customer);
	public void create (InvoiceHeader invoiceheader);
	public void update (InvoiceHeader invoiceheader);
	public void delete (InvoiceHeader invoiceheader);
}
