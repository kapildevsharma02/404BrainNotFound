package com.practice.marix;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixOnes {

	public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m) {
		// Write your code here.
		int[] arrRows = new int[n];
		int[] arrColm = new int[m];

		for (int i = 0; i < MAT.size(); i++) {
			for (int j = 0; j < MAT.get(i).size(); j++) {
				if (MAT.get(i).get(j) == 1) {
					arrRows[i] = 1;
					arrColm[j] = 1;
				}
			}
		}

		System.out.println("Printing arrRows array");
		for (int e : arrRows) {
			System.out.print(e + " ");
		}

		System.out.println("----------------");
		System.out.println("Printing arrColm array");
		for (int e : arrColm) {
			System.out.print(e + " ");
		}

		System.out.println("---------------");

		for (int i = 0; i < arrRows.length; i++) {
			for (int j = 0; j < arrColm.length; j++) {
				if (arrRows[i] == 1 || arrColm[j] == 1) {
					MAT.get(i).set(j, 1);
				}
			}
		}
		System.out.println(MAT);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 0, 0, 1));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(0, 0, 1, 0));
		ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
		ArrayList<ArrayList<Integer>> n = new ArrayList<>();
		n.add(a1);
		n.add(a2);
		n.add(a3);
		setMatrixOnes(n, 3, 4);
	}

}
