package Algorithm_Efficiency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zad1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		String str = sc.nextLine();
		int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("All numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("Please enter the wanted sum");
		int sum = sc.nextInt();
		
		if(hasSum(numbers, sum))System.out.println("Yes");
		else System.out.println("No");
		
		
	}
	
	public static boolean hasSum(int[] numbers, int sum) {
		// T(n) = O(n^2) С два вложени цикъла, които проверяват всяка с всяка стойност
		
		//For each number from the list excluding the last
		for(int i = 0; i < numbers.length - 1; i++) {
			//We match the current number with one of the following ones 
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == sum) {
					System.out.println(numbers[i] + " + " + numbers[j] +  " = " + sum);
					return true;
				}
			}
		}	
		return false;
	}

}
