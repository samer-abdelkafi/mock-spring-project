package com.mycompany.project;

import java.sql.SQLException;

public interface InvoiceDao {

    Long save(Invoice invoice) throws SQLException;

}
