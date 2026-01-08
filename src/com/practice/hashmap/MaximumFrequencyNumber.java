package com.practice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int n, int[] arr) {
		// Write your code here
		Map<Integer,Integer>map=new HashMap<>();
		for(int e:arr){
			if(map.containsKey(e)){
				map.put(e,map.get(e)+1);
			}else{
				map.put(e,1);
			}
		}
		int ans=0;
		int index=0;
		for(int e:arr) {
			if(map.get(e)>index) {
				ans=e;
				index=map.get(e);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=maxFrequencyNumber(5, new int []{4,-5,1,1});
		System.out.println(ans);
	}

}
