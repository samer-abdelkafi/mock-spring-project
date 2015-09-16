package com.mycompany.project;

import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Random;

/**
 * Created by b002ihq on 16/09/2015.
 */
@Component
public class InvoiceDaoImpl implements InvoiceDao {


    public Long save(Invoice invoice) throws SQLException {
        throw new SQLException("NO Database config!!!!");
    }
}
