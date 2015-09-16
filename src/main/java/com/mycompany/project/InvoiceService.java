package com.mycompany.project;

import java.sql.SQLException;
import java.util.Map;

public interface InvoiceService {

     Invoice processInvoice(Map<Product, Integer> products) throws SQLException;


}
