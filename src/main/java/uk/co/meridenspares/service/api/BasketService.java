package uk.co.meridenspares.service.api;

import java.util.List;

import uk.co.meridenspares.domain.Basket;
import uk.co.meridenspares.domain.BasketItem;
import uk.co.meridenspares.domain.StockItem;
import uk.co.meridenspares.service.api.exception.MsServiceException;

/**
 * This interface declares the specific methods to be provided by the 'Basket' service.
 * @author user
 *
 */
public interface BasketService extends GenericService<Basket, Long> {

	void add(Basket basket, StockItem item, int quantity) throws MsServiceException;
	
	void remove(Basket basket, StockItem item, int quantity) throws MsServiceException;
	
	void remove(Basket basket, BasketItem item, int quantity) throws MsServiceException;
	
	List<BasketItem> getItems(Basket basket);
	
	int getBasketQuantity(Basket basket, StockItem item);
}
