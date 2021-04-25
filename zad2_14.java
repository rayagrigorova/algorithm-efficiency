package Algorithm_Efficiency;

import java.util.Random;

public class zad2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		50 000, 100 000, 150 000, 200 000, 250 000 è 300 000
		
		System.out.printf("%20s%20s%20s%20s%20s", "ARRAY SIZE", "SELECTION SORT", "BUBBLE SORT", "MERGE SORT", "QUICK SORT");
		System.out.println();
		compareSortingTime(50_000);
		compareSortingTime(100_000);
		compareSortingTime(150_000);
		compareSortingTime(200_000);
		compareSortingTime(250_000);
		compareSortingTime(300_000);
		
		}

//		System.out.println("Hooray!");
	
	
	public static void compareSortingTime(int n) {
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		int [] arr3 = new int [n];
		int [] arr4 = new int [n];
		for(int i = 0; i < n; i++) {
			int x = (int)(Math.random()*1000);
			arr1[i] = x;
			arr2[i] = x;
			arr3[i] = x;
			arr4[i] = x;
			
		}
		long selectionSortTime = SelectionSort.selectionSort(arr1);
		long bubbleSortTime = BubbleSort.bubbleSort(arr2);
		long mergeSortTime = MergeSort.mergeSort(arr3);
		long quickSortTime = QuickSort.quickSort(arr4);
		
		System.out.printf("%20s", n);
		System.out.format("%20s", selectionSortTime);
		System.out.format("%20s", bubbleSortTime);
		System.out.format("%20s", mergeSortTime);
		System.out.format("%20s", quickSortTime);
		System.out.println();
	}

}
