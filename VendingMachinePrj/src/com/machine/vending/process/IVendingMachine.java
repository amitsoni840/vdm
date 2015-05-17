/**
 * 
 */
package com.machine.vending.process;

import java.util.List;

import com.machine.vending.item.Coin;
import com.machine.vending.item.Item;

/**
 * This interface contains methods required for each implementing vending
 * machine. It contains methods required for a vending machine.
 * 
 * @author ACER
 * 
 */
interface IVendingMachine {
	/**
	 * This method validate a coin value against supported coin types.
	 * 
	 * @param coinValue -
	 *            value of coin
	 * @return - {@link Coin}
	 */
	Coin validateCoin(double coinValue);

	/**
	 * This method validates an item against present items in stock.
	 * 
	 * @param itemId -
	 *            Item id.
	 * @return - {@link Item}
	 */
	Item validateItem(int itemId);

	/**
	 * This method contains functionality for dispensing an item from stock.
	 * 
	 * @param item -
	 *            {@link Item}
	 */
	void dispenseitem(Item item);

	/**
	 * This method is for calculating the change required to give back to
	 * customer against purchased item.
	 * 
	 * @param coin -
	 *            {@link Coin}
	 * @param item -
	 *            {@link Item}
	 * @return - double value of change amount.
	 */
	double calculateChange(Coin coin, Item item);

	List<Item> getItemsListAvailable();

	List<Coin> getCoinsSupported();
}
