package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.InvoiceDetail;
import com.jarana.repository.InvoiceDetailDAO;

@Transactional
@Service("invoicedetailService")
public class InvoiceDetailServiceImpl implements InvoiceDetailService {

	@Autowired
	private InvoiceDetailDAO invoicedetailDAO;

	public List<InvoiceDetail> findAll() {
		List<InvoiceDetail> listInvoiceDetail = invoicedetailDAO.findAll();
		return listInvoiceDetail;
	}

//	public InvoiceDetail findOne(TYPE PK) {
//		return invoicedetailDAO.findOne(PK);
//	}

//	public List<InvoiceDetail> findBy-ReplaceFIELD(TYPE FIELD) {
//		return invoicedetailDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (InvoiceDetail invoicedetail) {
		invoicedetailDAO.save(invoicedetail);
	}

	public void update (InvoiceDetail invoicedetail) {
		invoicedetailDAO.save(invoicedetail);
	}

	public void delete (InvoiceDetail invoicedetail) {
		invoicedetailDAO.delete(invoicedetail);
	}

	@Override
	public List<InvoiceDetail> findBySku(Long paSkuNb) {
		
		return invoicedetailDAO.findBySku(paSkuNb);	
	}

}
