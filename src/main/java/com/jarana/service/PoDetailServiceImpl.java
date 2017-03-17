package com.jarana.service;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.InvoiceDetail;
import com.jarana.entities.PoDetail;
import com.jarana.repository.InvoiceDetailDAO;
import com.jarana.repository.PoDetailDAO;

@Transactional
@Service("podetailService")
public class PoDetailServiceImpl implements PoDetailService {

	@Autowired
	private PoDetailDAO podetailDAO;
	
	@Autowired
	private InvoiceDetailDAO invoicedetailDAO;

	public List<PoDetail> findAll() {
		List<PoDetail> listPoDetail = podetailDAO.findAll();
		return listPoDetail;
	}

//	public PoDetail findOne(TYPE PK) {
//		return podetailDAO.findOne(PK);
//	}

//	public List<PoDetail> findBy-ReplaceFIELD(TYPE FIELD) {
//		return podetailDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (PoDetail podetail) {
		podetailDAO.save(podetail);
	}

	public void update (PoDetail podetail) {
		podetailDAO.save(podetail);
	}

	public void delete (PoDetail podetail) {
		podetailDAO.delete(podetail);
	}

	@Override
	public List<PoDetail> findPODetailBySku(Long paSkuNb) {
		// TODO Auto-generated method stub
		return podetailDAO.findPODetailBySku(paSkuNb);
	}
	
	public Map<Long, BigDecimal> priceTest() {

		final Map<Long, BigDecimal> result = new HashMap<>();

		final List<PoDetail> poddetails = podetailDAO.findAll();
		for (PoDetail poDetail : poddetails) {
			Long sku = poDetail.getPart().getPaSkuNb();
			if (!result.containsKey(sku)) {
				result.put(sku, poDetail.calculatePoPrice());
			} else {
				result.put(sku, result.get(sku).add(poDetail.calculatePoPrice()));
			}
		}

		final List<InvoiceDetail> invoices = invoicedetailDAO.findAll();
		for (InvoiceDetail invoiceDetail : invoices) {
			Long sku = invoiceDetail.getPart().getPaSkuNb();
			if (!result.containsKey(sku)) {
				result.put(sku, invoiceDetail.calculateInvPrice());
			} else {
				result.put(sku, result.get(sku).subtract(invoiceDetail.calculateInvPrice()));
			}
		}

		return result;
	}

}
