package Algorithm_Efficiency;

import java.util.Arrays;
import java.util.Scanner;

public class zad2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		String str = sc.nextLine();
		int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(numbers);
		System.out.println("All numbers (after sorting): ");
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
		//С двоично търсене за всеки елемент от масива T(n) = O(nlog(n))
		//Binary search will be done for each element except for the last one
		for(int i = 0; i < numbers.length - 1; i++) {
			if(found(numbers, sum - numbers[i], i + 1, numbers.length - 1)) {
				System.out.println(numbers[i] + " + " + (sum - numbers[i]) +  " = " + sum);
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean found (int[] numbers, int number, int startInd, int endInd) {
		while(startInd <= endInd) {
			int mid = (startInd + endInd) / 2;
			if(numbers[mid] < number) startInd = mid + 1;
			else if (numbers[mid] > number) endInd = mid - 1;
			else if(numbers[mid] == number) {
				return true;
			}
		}
		return false;
	}

}
