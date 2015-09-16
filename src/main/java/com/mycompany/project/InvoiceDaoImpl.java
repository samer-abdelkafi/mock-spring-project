package com.mycompany.project;

import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class InvoiceDaoImpl implements InvoiceDao {


    public Long save(Invoice invoice) throws SQLException {
        throw new SQLException("NO Database config!!!!");
    }
}
