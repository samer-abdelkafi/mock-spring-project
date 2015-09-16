package com.mycompany.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    public Invoice processInvoice(Map<Product, Integer> products) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setProducts(products);

        for(Map.Entry<Product, Integer> p : products.entrySet()) {
            invoice.setTotal(invoice.getTotal().add(p.getKey().getPrice().multiply(BigDecimal.valueOf(p.getValue()))));
        }

        invoiceDao.save(invoice);
        return invoice;
    }

}
