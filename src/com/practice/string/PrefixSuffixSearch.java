package com.practice.string;
/*
2
9
jatfst coeiyi feutva eyl casnctc vvrn iutqo oph yz
5    		       yourOutput	expectedOutput
j st  				0				0
ca tc				4				4
uyjj vmp			-1				-1	
v rn				5				5
y yz				8				8
7
xmjtcjdw rodyptgf vp vet wqlrfztn euviddkb ypkspvf
5		
w tn				4				4
vp vp 				2				2
o dv				-1				-1
ro gf				1				1
j m					0				-1
expected output
0
4
-1
5
8
4
2
-1
1
-1
*/

public class PrefixSuffixSearch {
	private static String[] Words;

	public static void wordFilter(String[] words) {
		// Write your code here.
		Words = words;
	}

	public static int find(String prefix, String suffix) {
		// Write your code here.
		int ans = -1;
		int pSize = prefix.length();
		int sSize = suffix.length();
		for (int i = Words.length - 1; i > -1; i--) {
			String word = Words[i];
			int wordSize = word.length();
			if (wordSize >= sSize && wordSize >= pSize) {
				String firstString = word.substring(0, pSize);
				String secondString = word.substring(wordSize - sSize, wordSize);
				if (firstString.equals(prefix) && secondString.equals(suffix)) {
					ans = i;
					break;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		String[] words = { "xmjtcjdw", "rodyptgf", "vp", "vet", "wqlrfztn", "euviddkb", "ypkspvf" };
		String[] words = { "jatfst", "coeiyi", "feutva", "eyl", "casnctc", "vvrn", "iutqo", "oph", "yz" };
		wordFilter(words);
		System.out.println(find("y", "yz"));
	}

}
