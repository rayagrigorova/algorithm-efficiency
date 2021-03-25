package Algorithm_Efficiency;

import java.util.Scanner;

public class zad2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Напишете програма, която подканва
//		потребителя да въведе низ и показва 
//		максимално нарастващата последователност
//		от символи (не е задължително тези символи да
//		са непосредствено един до друг).. Анализирайте
//		сложността на вашата програма. Ето примерно изпълнение
//		(имайки предвид, че ASCII кода на главна буква е по-малко число от
//		този на малка буква):
	//
//			Enter a string: Welcome
//			Welo
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s = sc.next();
		
		//For each char from the string (except the last one) we will do the following: we will choose the biggest char from the ones after it 
		//Then we will add it to a char array of size [string length - 1][2]
		char[][] arr = new char[s.length() - 1][2];
		for(int i = 0; i < s.length() - 1; i++) {
			arr[i][0] = s.charAt(i);
			char biggestChar = '\0';
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(j) > biggestChar)biggestChar = s.charAt(j);
			}
			arr[i][1] = biggestChar;
		}
		
		//We will go through that array and find the maximum difference between two chars and save their row
		int ind = 0;
		int maxDif = arr[0][1] - arr[0][0];
		//O(n)
		for(int i = 1; i < s.length() - 1; i++) {
			if(arr[i][1] - arr[i][0] > maxDif) {
				maxDif = arr[i][1] - arr[i][0];
				ind = i;
			}
		}
		

		//Then, we will create an answer string and go through all elements of the string again
		//If the current character is bigger than the last from the answer string, we must 
		//add it to the answer string
		int lastOccur = lastOccuranceOf(s, arr[ind][1]);
		String ans = "";
		//O(n)
		for(int i = ind ; i <= lastOccur; i++) {
			if(ans.length() == 0 || s.charAt(i) >= ans.charAt(ans.length() - 1) )ans += s.charAt(i) ;
		}
		System.out.println(ans);
	}
	//Let's call the two characters with a maximum difference ch1 and ch2. We must 
	//find the last occurance of the character c2 so the result can be as long as possible 
	public static int lastOccuranceOf(String s, char ch) {
		//O(n)
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}

}
