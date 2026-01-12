package com.practice.string;

/*
 Sample Input 1 :
2
1 3
a
abc
3 3
abz
abc
Sample Output 1 :
-1
1

 */
public class stringMania {
	public static int stringMania(int n, int m, String str1, String str2) {
		// Write your code here.
		if (str1.equals(str2)) {
			return 0;
		}
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (str1.charAt(i) < str2.charAt(i)) {
				return -1;
			} else if (str1.charAt(i) > str2.charAt(i)) {
				return 1;
			}
			i++;
			j++;
		}
		if (i == n) {
			return -1;
		}
		if (j == m) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int answer = stringMania(1, 3, "a", "abc");
		System.out.println(answer);
	}
}
