package com.jarana.controller;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.InvoiceDetail;
import com.jarana.entities.PoDetail;
import com.jarana.service.InvoiceDetailService;
import com.jarana.service.PoDetailService;

@Controller
@RequestMapping("/podetail")
public class PoDetailController { 

	@Autowired
	private PoDetailService podetailService;
	
	@Autowired
	private InvoiceDetailService invoiceDetailService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<PoDetail> findAll() {
		return podetailService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public PoDetail find(@PathVariable("id") Type id) {
//		return podetailService.findOne(id);
//	}

	@RequestMapping(value = "/sku/{paSkuNb}", method = RequestMethod.GET)
	@ResponseBody
	public List<PoDetail> findBySku(@PathVariable("paSkuNb") Long paSkuNb) {
		return podetailService.findPODetailBySku(paSkuNb);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody PoDetail podetail) {
		podetailService.create(podetail);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody PoDetail podetail) {
		podetailService.update(podetail);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody PoDetail podetail) {
		podetailService.delete(podetail);
	}

	@RequestMapping(value = "/balance", method = RequestMethod.GET)
	@ResponseBody
	public Map<Long, BigDecimal> priceTest(){
		return podetailService.priceTest();
	}
//	@RequestMapping(value = "/balance", method = RequestMethod.GET)
//	@ResponseBody
//	public Map<Long, BigDecimal> priceTest(){
//		
//		final Map<Long, BigDecimal> result = new HashMap<>();
//		
//		final List<PoDetail> poddetails = podetailService.findAll();
//		for(PoDetail poDetail : poddetails){
//			Long sku = poDetail.getPart().getPaSkuNb();
//			if(!result.containsKey(sku)){
//				result.put(sku, poDetail.calculatePoPrice());
//			}
//			else{
//				result.put(sku, result.get(sku).add(poDetail.calculatePoPrice()));
//			}
//		}
//		
//		final List<InvoiceDetail> invoices = invoiceDetailService.findAll();
//		for(InvoiceDetail invoiceDetail : invoices){
//			Long sku = invoiceDetail.getPart().getPaSkuNb();
//			if(!result.containsKey(sku)){
//				result.put(sku, invoiceDetail.calculateInvPrice());
//			}
//			else{
//				result.put(sku, result.get(sku).subtract(invoiceDetail.calculateInvPrice()));
//			}
//		}
//		
//		return result;
//	}
}
