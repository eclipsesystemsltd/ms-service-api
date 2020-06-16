package uk.co.meridenspares.service.api;

import uk.co.meridenspares.domain.Contact;

/**
 * This interface declares the specific methods to be provided by the 'Contact' service.
 * @author user
 *
 */
public interface ContactService extends GenericService<Contact, Long> {

	Contact findByContactName(String contactName);

}
