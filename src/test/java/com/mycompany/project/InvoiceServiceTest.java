package com.mycompany.project;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

//Load Spring contexte
@ContextConfiguration(locations = {"classpath:/application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class InvoiceServiceTest {

    // Create Mock
    @Mock
    private InvoiceDao invoiceDaoMock;

    @InjectMocks
    @Autowired
    private InvoiceService invoiceService;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testProcessInvoice() throws SQLException {

        // specify mock behave when method called
        when(invoiceDaoMock.save(any(Invoice.class))).thenReturn(Long.valueOf(1));

        Assert.assertNotNull(invoiceService);
        Map<Product, Integer> products = new HashMap<Product, Integer>();
        products.put(new Product("labtop", BigDecimal.valueOf(1255.50)), 2);
        Invoice invoice = invoiceService.processInvoice(products);

        Assert.assertEquals(1255.50 * 2, invoice.getTotal().doubleValue(), 0);

    }
}