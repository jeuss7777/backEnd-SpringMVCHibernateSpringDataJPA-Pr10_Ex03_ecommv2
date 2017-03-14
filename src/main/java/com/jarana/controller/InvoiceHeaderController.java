package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.InvoiceHeader;
import com.jarana.service.InvoiceHeaderService;

@Controller
@RequestMapping("/invoiceheader")
public class InvoiceHeaderController { 

	@Autowired
	private InvoiceHeaderService invoiceheaderService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<InvoiceHeader> findAll() {
		return invoiceheaderService.findAll();
	}

	@RequestMapping(value = "/{ihInvNb}", method = RequestMethod.GET)
	@ResponseBody
	public InvoiceHeader find(@PathVariable("ihInvNb") Long ihInvNb) {
		return invoiceheaderService.findOne(ihInvNb);
	}
	
	@RequestMapping(value = "/det/{ihInvNb}", method = RequestMethod.GET)
	@ResponseBody
	public InvoiceHeader findDet(@PathVariable("ihInvNb") Long ihInvNb) {
		return invoiceheaderService.findOneDet(ihInvNb);
	}
	
	//@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
	//@ResponseBody
	//public List<InvoiceHeader> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
	//	return invoiceheaderService.findBy-ReplaceFIELD(FIELD);
	//}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody InvoiceHeader invoiceheader) {
		invoiceheaderService.create(invoiceheader);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody InvoiceHeader invoiceheader) {
		invoiceheaderService.update(invoiceheader);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody InvoiceHeader invoiceheader) {
		invoiceheaderService.delete(invoiceheader);
	}

}
