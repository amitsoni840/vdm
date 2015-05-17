/**
 * 
 */
package com.machine.vending.item;

/**
 * This class represents different type of coins used as input to vending
 * machine for getting items.
 * 
 * @author ACER
 * 
 */
public class Coin {
	/**
	 * Coin Id.
	 */
	private int coinId;
	/**
	 * Value of Coin. i.e amount.
	 */
	private int coinValue;

	public Coin(int coinId, int coinValue){
		this.coinId = coinId;
		this.coinValue = coinValue;
	}
	/**
	 * @return the coinId
	 */
	public int getCoinId() {
		return coinId;
	}
	/**
	 * @param coinId the coinId to set
	 */
	public void setCoinId(int coinId) {
		this.coinId = coinId;
	}
	/**
	 * @return the coinValue
	 */
	public int getCoinValue() {
		return coinValue;
	}
	/**
	 * @param coinValue the coinValue to set
	 */
	public void setCoinValue(int coinValue) {
		this.coinValue = coinValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
		return Double.toString(this.coinValue);
	}
	
}
