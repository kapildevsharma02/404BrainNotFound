package com.practice.string;

public class ProgramToCheckTheValidityOfaPassword {

	public static boolean isValid(String str) {
		// Write your code here.
		boolean length = lengthOfThePassword(str);
		boolean consistOfthespace = consistOfTheSpace(str);
		boolean consistOfTheDigit = consistOfTheDigit(str);
		boolean consistOfTheSpecialCharacter = consistOfTheCharacter(str);
		boolean consistOfTheLowerCaseAlphabet = consistOfTheLowerCaseAlphabet(str);
		boolean consistOfTheUpperCaseAlphabet = consistOfTheUpperCaseAlphabet(str);
		if (length && consistOfTheLowerCaseAlphabet && consistOfTheUpperCaseAlphabet && consistOfthespace
				&& consistOfTheDigit && consistOfTheSpecialCharacter) {
			return true;
		}
		return false;
	}

	private static boolean consistOfTheLowerCaseAlphabet(String str) {
		// TODO Auto-generated meth od stub
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				return true;
			}
		}
		return false;
	}

	private static boolean consistOfTheUpperCaseAlphabet(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				return true;
			}
		}
		return false;
	}

	private static boolean consistOfTheCharacter(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 33 && str.charAt(i) <= 47) || (str.charAt(i) >= 58 && str.charAt(i) <= 64)
					|| (str.charAt(i) >= 91 && str.charAt(i) <= 96) || (str.charAt(i) >= 123 && str.charAt(i) <= 126)) {
				return true;
			}
		}
		return false;
	}

	private static boolean consistOfTheDigit(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	private static boolean consistOfTheSpace(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				return false;
			}
		}
		return true;
	}

	private static boolean lengthOfThePassword(String str) {
		// TODO Auto-generated method stub
		if (str.length() >= 8 && str.length() <= 15) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean ans = isValid("Zz}0///|");
		System.out.println(ans);
	}

}
