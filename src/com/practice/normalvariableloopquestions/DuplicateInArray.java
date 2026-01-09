package com.practice.normalvariableloopquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateInArray {

	public static int findDuplicate(ArrayList<Integer> arr) {
		int answer=0;
		for(int i=0;i<arr.size();i++){
			answer=answer^arr.get(i)^i;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=findDuplicate(new ArrayList<>(Arrays.asList(4,2,1,3,1)));
		System.out.println(answer);
	}
}
