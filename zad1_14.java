package Algorithm_Efficiency;

import java.util.Comparator;

public class zad1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Напишете следните два темплейтни метода, използвайки
//		сортиране чрез сливане. Първият метод сортира елементите,
//		използвайки интерфейса Comparable, а вторият използва Comparator.
//
//		public static <E extends Comparable<E>> void mergeSort(E[] list)
//		public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)

	}
	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if (list.length > 1) {
			// Merge sort the first half
						E[] firstHalf = (E[]) new Comparable[list.length / 2];
						System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
						mergeSort(firstHalf);
			// Merge sort the second half
						int secondHalfLength = list.length - list.length / 2;
						E[] secondHalf = (E[]) new Comparable[secondHalfLength];
						System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
						mergeSort(secondHalf);
			// Merge firstHalf with secondHalf into list
						merge(firstHalf, secondHalf,list);
					}
	}
	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
		if (list.length > 1) {
			// Merge sort the first half
						E[] firstHalf = (E[]) new Object[list.length / 2];
						System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
						mergeSort(firstHalf, comparator);
			// Merge sort the second half
						int secondHalfLength = list.length - list.length / 2;
						E[] secondHalf = (E[]) new Object[secondHalfLength];
						System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
						mergeSort(secondHalf, comparator);
			// Merge firstHalf with secondHalf into list
						merge(firstHalf, secondHalf, list, comparator);
					}
	}
	public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp){
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1].compareTo(list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
	public static <E> void merge(E[] list1, E[] list2, E[] temp,Comparator<? super E> comparator) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (comparator.compare(list1[current1], (list2[current2])) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
}
