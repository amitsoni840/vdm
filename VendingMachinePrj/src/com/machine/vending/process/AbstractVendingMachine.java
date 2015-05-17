/**
 * 
 */
package com.machine.vending.process;

import java.util.List;

import com.machine.vending.item.Coin;
import com.machine.vending.item.Item;
import com.machine.vending.item.VendingMachineException;
import com.machine.vending.mock.dao.MockVendingMachineDao;

/**
 * This class contains common functionality which is required for each vending
 * machine.
 * 
 * @author ACER
 * 
 */
public abstract class AbstractVendingMachine implements IVendingMachine {

	MockVendingMachineDao machinDao = new MockVendingMachineDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#calculateChange(com.machine.vending.item.Coin,
	 *      com.machine.vending.item.Item)
	 */
	public double calculateChange(Coin coin, Item item) {
		return coin.getCoinValue() - item.getItemPrice();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#dispenseitem(int)
	 */
	public void dispenseitem(Item item) {
		machinDao.removeItemFromStock(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#dispenseItem(com.machine.vending.item.Item,
	 *      com.machine.vending.item.Coin)
	 */
	public abstract void processOrder(int itemId, double coinValue);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#validateCoin(com.machine.vending.item.Coin)
	 */
	public Coin validateCoin(double coinValue) {

		for (Coin coin : machinDao.getCoinsList()) {
			if (coin.getCoinValue() == coinValue) {
				return coin;
			}
		}
		throw new VendingMachineException("VE", "Coin valued " + coinValue
				+ " not supported");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#validateItem(com.machine.vending.item.Item)
	 */
	public Item validateItem(int itemId) {
		for (Item item : machinDao.getItemsList()) {
			if (itemId == item.getItemId()) {
				return item;
			}
		}
		throw new VendingMachineException("VE", "Item " + itemId
				+ " not available");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#getCoinsSupported()
	 */
	public List<Coin> getCoinsSupported() {
		return machinDao.getCoinsList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.IVendingMachine#getItemsListAvailable()
	 */
	public List<Item> getItemsListAvailable() {
		return machinDao.getItemsList();
	}

}
