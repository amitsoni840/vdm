/**
 * 
 */
package com.machine.vending.item;

/**
 * This is a machine exception and can be used in case of any failure while
 * processing order.
 * 
 * @author ACER
 * 
 */
public class VendingMachineException extends RuntimeException {

	/**
	 * Serial Version ID.
	 */
	private static final long serialVersionUID = -8952895361911170837L;
	/**
	 * Error Code.
	 */
	String errorCode;
	/**
	 * Error Message.
	 */
	String errorMessage;
	/**
	 * Constructor.
	 * @param errorCode
	 * @param errorMessage
	 */
	public VendingMachineException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
