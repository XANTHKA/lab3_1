package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;



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
		TaxPolicy mockTaxPolicy = Mockito.mock(TaxPolicy.class);
		InvoiceRequest mockInvoiceRequest = Mockito.mock(InvoiceRequest.class);
		ProductData mocProductData = Mockito.mock(ProductData.class);
		//when(mockProductData.getProductData()).thenReturn(1, 1.0, "pierwszyprodukt", "typ", 01-01-2015);
		Collection<RequestItem> kolekcja = new <RequestItem>();
		(mocProductData, 2, 2.0);
		when(mockInvoiceRequest.getItems()).thenReturn(kolekcja);
		
		
		
		
		
				
				
				
		invoice = bk.issuance(mockInvoiceRequest, mockTaxPolicy);
		//Assert
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
