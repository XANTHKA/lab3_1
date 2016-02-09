package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.Product;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class BookKeeperTest {

	private BookKeeper bk;

	@Test
	public void test() {
		
		InvoiceFactory invoiceFactory = new InvoiceFactory();
		bk = new BookKeeper(invoiceFactory);
		Invoice invoice;
		InvoiceRequest mockInvoiceRequest = Mockito.mock(InvoiceRequest.class); 
		TaxPolicy mockTaxPolicy = Mockito.mock(TaxPolicy.class);
		InvoiceLine mockInvoiceLine = Mockito.mock(InvoiceLine.class);
		InvoiceRequest mockInvoiceRequest = mockito.mock
		
		
				
				
				
		invoice = bk.issuance(mockInvoiceRequest, mockTaxPolicy);
		System.out.print(invoice.getGros());	
		
		
		
//	InvoiceFactory invoiceFactory = new InvoiceFactory();
//	bk = new BookKeeper(invoiceFactory);
//	Invoice invoice;
//		Id numerKlienta = new Id("123");
//		String nazwaKlienta = "pierwszy klient";
//		ClientData klientA = new ClientData(numerKlienta, nazwaKlienta );
//	InvoiceRequest invoiceRequest = new InvoiceRequest(klientA);
//		Money cenaProduktu = new Money(1);
//		String nazwaProduktu = "pierwszy produkt";
//		ProductType typProduktu = ProductType.FOOD;
//		Id numerProduktu = new Id("1");
//		Date data = new Date();
//	ProductData pierwszyprodukt = new ProductData(numerProduktu, cenaProduktu, nazwaProduktu, typProduktu, data);
//		int ilosc = 3;
//		Money wartoscNetto;
//		Tax podatek;	
//	Product mpierwszyProdukt = new Product();
//	
//	InvoiceLine nowaLinia = new InvoiceLine(pierwszyprodukt, ilosc, wartoscNetto, podatek);
//		invoiceRequest.addItem(nowaLinia);
//		TaxPolicy taxPolicy = null;
//		//Invoice invoice = invoiceFactory.create(invoiceRequest.getClientData());
//		invoice = bk.issuance(invoiceRequest, taxPolicy);
//		System.out.print(invoice.getGros());
	}
}
