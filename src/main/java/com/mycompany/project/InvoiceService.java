package com.mycompany.project;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by b002ihq on 16/09/2015.
 */
public interface InvoiceService {

     Invoice processInvoice(Map<Product, Integer> products) throws SQLException;


}
