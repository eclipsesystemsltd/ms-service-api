package uk.co.meridenspares.service.api;

import java.io.Serializable;
import java.util.List;

import uk.co.meridenspares.service.api.exception.MsServiceException;

/**
 * This interface declares the basic methods that will be provided by the MS service entities.
 * @author user
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericService<T, PK extends Serializable> {

	/**
	 * Returns instantiated type with given id.
	 * @param id
	 * @return Populated object or null if not in database
	 * @throws MsServiceException
	 */
	T find(PK id) throws MsServiceException;
	
	/**
	 * Returns all objects of instantiated type.
	 * @return List of instantiated objects
	 * @throws MsServiceException
	 */
	List<T> findAll() throws MsServiceException;
	
	/**
	 * Adds a new instance of the instantiated type, effectively adding a new row in the database.
	 * @param object
	 * @return
	 * @throws MsServiceException
	 */
	T save(final T object) throws MsServiceException;
	
	/**
	 * Updates an existing database row.
	 * @param object
	 * @return
	 * @throws MsServiceException
	 */
	T update(final T object) throws MsServiceException;
	
	/**
	 * Removes a row from the database.
	 * @param object
	 * @throws MsServiceException
	 */
	void remove(final T object) throws MsServiceException;
}
