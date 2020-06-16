/**
 * 
 */
package uk.co.meridenspares.service.api.exception;

/**
 * @author user
 *
 */
public class MsServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public MsServiceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public MsServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public MsServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MsServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MsServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
