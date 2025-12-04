package com.practice.matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SubQuerySum {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr,
			ArrayList<ArrayList<Integer>> queries) {
		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		for (int k = 0; k < queries.size(); k++) {
			int sum = 0;
			for (int i = 0; i < arr.size(); i++) {
				for (int j = 0; j < arr.get(i).size(); j++) {
					if (i >= queries.get(k).get(0) && j >= queries.get(k).get(1) && i <= queries.get(k).get(2)
							&& j <= queries.get(k).get(3)) {
						sum += arr.get(i).get(j);
					}
				}
			}
			ans.add(sum);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(2, 1, 2));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2, 6));
		ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(1, 4, 5));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(Arrays.asList(a1, a2, a3));
		ArrayList<Integer> q1 = new ArrayList<>(Arrays.asList(1, 1, 2, 2));
		ArrayList<Integer> q2 = new ArrayList<>(Arrays.asList(0, 1, 0, 2));
		ArrayList<ArrayList<Integer>> queries = new ArrayList<>(Arrays.asList(q1, q2));
		ArrayList<Integer> ans = findSubmatrixSum(arr, queries);
		System.out.println(ans);
	}
}
