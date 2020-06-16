package uk.co.meridenspares.service.api;

import uk.co.meridenspares.domain.AppUser;

/**
 * This interface declares the specific methods to be provided by the 'AppUser' service.
 * @author user
 *
 */
public interface AppUserService extends GenericService<AppUser, Long> {

	public AppUser findByAppUserName(String userName);

}
