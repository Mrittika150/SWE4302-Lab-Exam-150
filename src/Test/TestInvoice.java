package Test;
import Class.Invoice;

import  org.junit.Test;

public class TestInvoice {
    @Test
    public void testInvoice() {
        boolean expectedValue = true;
        Invoice invoice = new Invoice();
        equals(expectedValue,invoice.generateInvoice());

    }
}
