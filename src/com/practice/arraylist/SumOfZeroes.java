package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*Input
 * 
 * 1 0 
 * 0 1 
 * 
 * Output 
 * 4
 */
public class SumOfZeroes {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		Integer count = 0;
		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(i).size(); j++) {
				if (mat.get(i).get(j) == 0) {
					// left
					if ((j >= 1) && (mat.get(i).get(j - 1) == 1)) {
						count++;
					}
					// Upper
					if ((i >= 1) && (mat.get(i - 1).get(j) == 1)) {
						count++;
					}
					// Right
					if ((j != mat.get(i).size() - 1) && (mat.get(i).get(j + 1) == 1)) {
						count++;
					}
					// Bottom
					if ((i != mat.size() - 1) && (mat.get(i + 1).get(j) == 1)) {
						count++;
					}
				}
			}
		}
		return count++;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 1));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(0, 1));
//		ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(1, 1));
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(Arrays.asList(a1, a2));
		Integer answer = coverageOfMatrix(ans);
		System.out.println(answer);

	}

}
