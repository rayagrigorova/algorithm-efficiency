package Algorithm_Efficiency;

import java.util.Arrays;
import java.util.Scanner;

public class zad3_12 {

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
//		Варианта, работещ само за подреден масив.
//		Сравнявайки двата най-отдалечени елемента
//		и местейки долната или горната граница в зависимост от
//		необходимостта. T(n) = O(n)
		int low = 0, high = numbers.length - 1;
		while(low <= high) {
			int x = numbers[low] + numbers[high];
			if(x < sum)low++;
			else if(x > sum) high--;
			else if(x == sum) {
				System.out.println(numbers[low] + " + " + numbers[high] + " = " + sum);
				return true;
			}
		} 
		return false;
	}
	
	

}
