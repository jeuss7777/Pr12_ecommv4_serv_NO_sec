package com.jarana.service;
import java.util.List;

import com.jarana.entities.InvoiceDetail;
public interface InvoiceDetailService {
	public List<InvoiceDetail> findAll();
//	public InvoiceDetail findOne(TYPE PK);
	
	List<InvoiceDetail> findBySku(Long paSkuNb);
	public void create (InvoiceDetail invoicedetail);
	public void update (InvoiceDetail invoicedetail);
	public void delete (InvoiceDetail invoicedetail);
}
