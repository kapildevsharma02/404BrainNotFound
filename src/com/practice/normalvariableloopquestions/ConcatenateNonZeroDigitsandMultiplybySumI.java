package com.practice.normalvariableloopquestions;
public class ConcatenateNonZeroDigitsandMultiplybySumI {
	public static long sumAndMultiply(int n) {
		String convert = String.valueOf(n);
		long sum = 0L;
		int temp;
		long count = 0;
		long sumOfDigits = 0;
		for (char c : convert.toCharArray()) {
			if (c == '0') {
				continue;
			} else {
				temp = c - '0';
				if (count == 0) {
					sum = temp;
					sumOfDigits += temp;
					count++;
				} else {
					sum = sum * 10 + temp;
					sumOfDigits += temp;
				}

			}
		}
		return sum*sumOfDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = sumAndMultiply(1000);// 123*10 =1230+4 =>1234
		System.out.println(ans);
	}

}