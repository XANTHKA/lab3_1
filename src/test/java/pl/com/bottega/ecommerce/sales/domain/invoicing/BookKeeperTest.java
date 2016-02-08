package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class BookKeeperTest {

	private BookKeeper bk;

	@Test
	public void test() {
		InvoiceFactory invoiceFactory = new InvoiceFactory();
		bk = new BookKeeper(invoiceFactory);
		Invoice invoice;
		InvoiceRequest invoiceRequest = new InvoiceRequest(new ClientData(new Id("123"),"aaaa"));
		invoiceRequest.addItem(new InvoiceLine(new ProductData(), 0, null, null));
		TaxPolicy taxPolicy = null;
		//Invoice invoice = invoiceFactory.create(invoiceRequest.getClientData());
		invoice = bk.issuance(invoiceRequest, taxPolicy);
		System.out.print(invoice.getGros());
	}
