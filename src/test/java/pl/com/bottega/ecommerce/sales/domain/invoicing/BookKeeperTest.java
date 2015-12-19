package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookKeeperTest {

	private BookKeeper bk;

	@Test
	public void test() {
		InvoiceFactory invoiceFactory = null;
		bk = new BookKeeper(invoiceFactory);
		
		
	}

}
