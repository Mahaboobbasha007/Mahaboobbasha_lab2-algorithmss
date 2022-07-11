package com.basha.lab2.service;

import java.util.Scanner;

public class Transactions {
	Scanner sc = new Scanner(System.in);

	public void chekTransaction(int arr[], int targetNo) {

		while (targetNo-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved ");
			}
		}
	}

}
