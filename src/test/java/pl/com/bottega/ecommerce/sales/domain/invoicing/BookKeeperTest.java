package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
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
		ProductData mockProductData = Mockito.mock(ProductData.class);
		RequestItem mockRequestItem = Mockito.mock(RequestItem.class);
		when(mockTaxPolicy.calculateTax(Matchers.any(ProductType.class), Matchers.any(Money.class))).thenReturn(new Tax(new Money(0.0), "VAT"));
		when(mockProductData.getType()).thenReturn(ProductType.DRUG);
		when(mockRequestItem.getTotalCost()).thenReturn(new Money (1.0));
		when(mockRequestItem.getProductData()).thenReturn(mockProductData);
		ArrayList<RequestItem> kolekcja = new ArrayList<RequestItem>();
		kolekcja.add(mockRequestItem);
		when(mockInvoiceRequest.getItems()).thenReturn(kolekcja);
		invoice = bk.issuance(mockInvoiceRequest, mockTaxPolicy);
		//Assert
		System.out.print(invoice.getGros());	
		
	}
}
