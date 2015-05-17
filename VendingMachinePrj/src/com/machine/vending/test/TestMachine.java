package com.machine.vending.test;

import java.util.Scanner;

import com.machine.vending.mock.dao.MockVendingMachineDao;
import com.machine.vending.process.VendingMachine;

public class TestMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		try{
		while (true) {
			System.out.println("List of item available in Machine :");
			System.out.println((machine.getItemsListAvailable()));
			System.out.println("List of coins supported "
					+ machine.getCoinsSupported());
			System.out.println("Please input item ID");
			Scanner in = new Scanner(System.in);
			int itemId = in.nextInt();
			System.out.println("Please input coin");
			double coin = in.nextDouble();
			machine.processOrder(itemId, coin);
			System.out.println("Do you want to exit(Y/N)");
			if ("Y".equalsIgnoreCase(in.next())) {
				System.exit(0);
			}
		}
		}catch(Exception e){
			System.out.println("Incorrect Input");
		}
	}

}
