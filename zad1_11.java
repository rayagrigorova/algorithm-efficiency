package Algorithm_Efficiency;

import java.util.Scanner;

public class zad1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//
//			Enter a string s1: Mississippi
//			Enter a string s2: sip
//			matched at index 6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string s1:");
		String s1 = sc.nextLine();
		System.out.println("Enter a string s2:");
		String s2 = sc.nextLine();

		printWithSpacing(s1);
		//O(n*m)
		int ind = -1;
		//for each character from the big string
		for(int i = 0; i < s1.length(); i++) {
			boolean valid = true;
			//we go through the smaller string 
			for(int j = 0; j < s2.length() && valid; j++) {
				if(j + i >= s1.length() || s1.charAt(i + j) != s2.charAt(j)) {
					valid = false;
				}
			}
			if(valid) {ind = i; break;}
		}	
		
		if(ind != -1) {
			System.out.println("matched at index " + ind );
		}
		else {
			System.out.println("Match not found");
		}
		sc.close();

	}
	
	public static void printWithSpacing(String s) {
		//O(n)
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "|");
		}
		System.out.println();
		for(int i = 0; i < s.length(); i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
