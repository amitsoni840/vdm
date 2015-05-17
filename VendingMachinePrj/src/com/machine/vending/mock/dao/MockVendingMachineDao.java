/**
 * 
 */
package com.machine.vending.mock.dao;

import java.util.ArrayList;
import java.util.List;

import com.machine.vending.item.Coin;
import com.machine.vending.item.Item;

/**
 * @author ACER
 * 
 */
public class MockVendingMachineDao {

	private static List<Item> itemsList = new ArrayList<Item>();
	private static List<Coin> coinsList = new ArrayList<Coin>();

	static {
		itemsList.add(new Item(1, "Pepsi", 10));
		itemsList.add(new Item(2, "Biscuit", 9));
		itemsList.add(new Item(3, "Chocolate", 8));
		itemsList.add(new Item(4, "Waffers", 7));
		itemsList.add(new Item(5, "Ice Cream", 6));
		itemsList.add(new Item(6, "Water", 5));
		itemsList.add(new Item(7, "Stroop Waffels", 4));
		itemsList.add(new Item(8, "Coke", 3));
		itemsList.add(new Item(9, "Limca", 2));
		itemsList.add(new Item(10, "Burger", 1));

		coinsList.add(new Coin(1, 1));
		coinsList.add(new Coin(2, 2));
		coinsList.add(new Coin(3, 5));
		coinsList.add(new Coin(4, 10));
	}

	public List<Coin> getCoinsList() {
		return coinsList;
	}

	public List<Item> getItemsList() {
		return itemsList;
	}

	public void removeItemFromStock(Item item) {
		itemsList.remove(item);
	}
}
