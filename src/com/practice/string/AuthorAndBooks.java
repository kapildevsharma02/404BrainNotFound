package com.practice.string;

/*
Sample Input 1 :
2
2
4 ChetanBhagat TwoStates Revolution HalfGirlfriend OneIndianGirl
2 JKRowling HarryPotter FantasticBeasts
1
2 JeffreyArcher OldLove FalseImpression
Sample Output 1 :
1. ChetanBhagat
    A. TwoStates
    B. Revolution
    C. HalfGirlfriend
    D. OneIndianGirl 
2. JKRowling
    A. HarryPotter
    B. FantasticBeasts
1. JeffreyArcher
    A. OldLove 
    B. FalseImpression
*/
public class AuthorAndBooks {
	public static String[] arrangeAuthors(String[][] s) {
		// Write your code here
		int authors = s.length;
		String str[] = new String[authors];

		for (int i = 0; i < authors; i++) {
			StringBuilder sb = new StringBuilder();

			sb.append((i + 1) + ". " + s[i][0]);
			for (int j = 1; j < s[i].length; j++) {
				sb.append("\n\t" + (char) (64 + j) + ". " + s[i][j]);
			}

			str[i] = sb.toString();
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s = new String[][] {};
		String[] array = new String[] { "ChetanBhagat", "TwoStates", "Revolution", "HalfGirlfriend", "OneIndianGirl" };
		String[] secondArray = new String[] { "JKRowling", "HarryPotter", "FantasticBeasts" };
		String[] answer = arrangeAuthors(new String[][] { array, secondArray });
		for (String abc : answer) {
			System.out.print(abc + " ");
			System.out.println();
		}
	}

}