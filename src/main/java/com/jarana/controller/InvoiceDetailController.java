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

import com.jarana.entities.InvoiceDetail;
import com.jarana.service.InvoiceDetailService;

@Controller
@RequestMapping("/invoicedetail")
public class InvoiceDetailController { 

	@Autowired
	private InvoiceDetailService invoicedetailService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<InvoiceDetail> findAll() {
		return invoicedetailService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public InvoiceDetail find(@PathVariable("id") Type id) {
//		return invoicedetailService.findOne(id);
//	}

	@RequestMapping(value = "/sku/{paSkuNb}", method = RequestMethod.GET)
	@ResponseBody
	public List<InvoiceDetail> findBySku(@PathVariable("paSkuNb") Long paSkuNb) {
		return invoicedetailService.findBySku(paSkuNb);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody InvoiceDetail invoicedetail) {
		invoicedetailService.create(invoicedetail);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody InvoiceDetail invoicedetail) {
		invoicedetailService.update(invoicedetail);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody InvoiceDetail invoicedetail) {
		invoicedetailService.delete(invoicedetail);
	}

}
