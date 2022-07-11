package com.basha.lab2.driver;

import java.util.Scanner;

import com.basha.lab2.service.Transactions;

class Main {
	public static void main(String args[]) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array");
			int size = s.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the values of array");
			for (int i = 0; i < size; i++)
				arr[i] = s.nextInt();
			System.out.println("Enter the total no of targets that needs to be achieved");
			int targetNo = s.nextInt();
			Transactions trans = new Transactions();
			trans.chekTransaction(arr, targetNo);

		}
	}
}
