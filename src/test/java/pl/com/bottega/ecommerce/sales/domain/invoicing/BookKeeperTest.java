package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;

import org.mockito.Matchers;
import org.mockito.Mockito;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class BookKeeperTest {

	private BookKeeper bk;
	int ilosclinii;
	
	
	public void create() {
	InvoiceFactory invoiceFactory = new InvoiceFactory();
	bk = new BookKeeper(invoiceFactory);
	
	TaxPolicy mockTaxPolicy = Mockito.mock(TaxPolicy.class);
	when(mockTaxPolicy.calculateTax(Matchers.any(ProductType.class), Matchers.any(Money.class))).thenReturn(new Tax(new Money(0.0), "VAT"));
	
	ProductData mockProductData = Mockito.mock(ProductData.class);
	when(mockProductData.getType()).thenReturn(ProductType.DRUG);
	
	RequestItem mockRequestItem = Mockito.mock(RequestItem.class);
	when(mockRequestItem.getTotalCost()).thenReturn(new Money (1.0));
	when(mockRequestItem.getProductData()).thenReturn(mockProductData);
	
	ArrayList<RequestItem> kolekcja = new ArrayList<RequestItem>();
	kolekcja.add(mockRequestItem);
	
	InvoiceRequest mockInvoiceRequest = Mockito.mock(InvoiceRequest.class);
	when(mockInvoiceRequest.getItems()).thenReturn(kolekcja);
	
	Invoice invoice = bk.issuance(mockInvoiceRequest, mockTaxPolicy);
	ilosclinii = invoice.getItems().size();
	//Mockito.verify(mockInvoiceRequest, Mockito.times(1)).getItems();
	}	
	@Test
	public void test() {
		
		assertSame(1,ilosclinii);
		
	}
}
