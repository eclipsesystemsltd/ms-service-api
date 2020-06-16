package uk.co.meridenspares.service.api;


/**
 * This interface declares the specific methods to be provided by the 'Authentication' service.
 * @author user
 *
 */
public interface AuthenticationService {

	boolean login(String username, String password);
}
