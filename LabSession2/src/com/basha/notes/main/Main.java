package com.basha.notes.main;

import java.util.Scanner;

import com.basha.notes.service.MergeSortImplementation;
import com.basha.notes.service.NoteCounter;

public class Main {

	public static void main(String[] args) {
		MergeSortImplementation mergeImplementation = new MergeSortImplementation();
		NoteCounter nCount = new NoteCounter();
		System.out.println("Enter the size of currency Denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency Denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeImplementation.sort(notes, 0, notes.length - 1);

		nCount.nCountImplementation(notes, amount);
		sc.close();

	}

}
