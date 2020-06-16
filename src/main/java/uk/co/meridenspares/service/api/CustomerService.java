package uk.co.meridenspares.service.api;

import java.util.List;

import uk.co.meridenspares.domain.Customer;

/**
 * This interface declares the specific methods to be provided by the 'Customer' service.
 * @author user
 *
 */
public interface CustomerService extends GenericService<Customer, Long> {

	List<Customer> getCustomerByEmail(String email);
}
