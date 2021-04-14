package Algorithm_Efficiency;


import java.util.*;

public class zad2_11{
	private static final String ArrayList = null;

	public static void main(String[] args) {
//		Напишете програма, която подканва
//		потребителя да въведе низ и показва
//		максимално нарастващата последователност
//		от символи (не е задължително тези символи
//		да са непосредствено един до друг).. Анализирайте
//		сложността на вашата програма. Ето примерно изпълнение
//		(имайки предвид, че ASCII кода на главна буква е по-малко
//		число от този на малка буква):
//
//			Enter a string: Welcome
//			Welo
		
//For the string Woabc the answer will be abc as it is the longest sequence of chars in ascending order
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s = sc.next();
		
		//An ArrayList to store the strings 
		ArrayList <String> strings = new ArrayList <String>();
		
		//For each character we will make the longest possible sequence of chars in ascending order
		//Time complexity: c * (n - 1) + c * (n - 2) ... + c = c * (n - 1 + 1) (n - 1)/ 2 = n * (n - 1 ) = n ^ 2 - n = O(n^2)
		//For all characters except for the last
		for(int i = 0; i < s.length() - 1; i++) {
			String temp = "";
			//Current character will be the start of the ascending string 
			temp += s.charAt(i);
			//All characters bigger than or equal to the last character of temp will be added to temp
			for(int j = i + 1; j < s.length(); j++) {
				if(temp.charAt(temp.length() - 1) <= s.charAt(j)){
					temp += s.charAt(j);
				}
			}
			//Then, temp will be added to the ArrayList of strings 
			strings.add(temp);
			
		}
		//Now we must find the index of the longest string
		int ind = -1;
		int biggestLength = -1;
		//O(n)
		for(int i = 0; i < strings.size(); i++) {
			if(strings.get(i).length() > biggestLength) {
				biggestLength = strings.get(i).length();
				ind = i;
			}
		}
		
		System.out.println(strings.get(ind));
	}
}
