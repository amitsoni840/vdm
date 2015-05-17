/**
 * 
 */
package com.machine.vending.process;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.machine.vending.item.Coin;
import com.machine.vending.item.Item;
import com.machine.vending.item.VendingMachineException;

/**
 * @author ACER
 * 
 */
public class VendingMachine extends AbstractVendingMachine {

	Logger log = Logger.getLogger("VE");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.machine.vending.process.AbstractVendingMachine#processOrder(com.machine.vending.item.Item,
	 *      com.machine.vending.item.Coin)
	 */
	@Override
	public void processOrder(int itemId, double coinValue) {
		try {
			Coin coin = validateCoin(coinValue);
			Item item = validateItem(itemId);
			double change = calculateChange(coin, item);
			if(change < 0){
				throw new VendingMachineException("VE","Your amount value is less than the price of the item, Please try again");
			}else if(change> 0){
				System.out.println("Please collect change :"+change);
			}
			dispenseitem(item);
			System.out.println("Please collect your item from tray");
		} catch (VendingMachineException ve) {
			log.log(Level.WARNING, ve.getErrorMessage());
		}

	}

}
