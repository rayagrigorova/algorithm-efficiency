package Algorithm_Efficiency;

import java.util.Comparator;
import java.util.Random;

public class zad1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�������� �������� ��� ���������� ������, �����������
//		��������� ���� �������. ������� ����� ������� ����������,
//		����������� ���������� Comparable, � ������� �������� Comparator.
//
//		public static <E extends Comparable<E>> void mergeSort(E[] list)
//		public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
		Cat[] arr1 = new Cat[10];
		String[] names = {"Ivan", "Georgi", "Ivana", "Gergana", "Milena", "Preslava", "Tsvetan", "Kotka", "Ivanka", "Pesho"};
		int[] ages = {1, 12, 4, 7, 3, 8, 6, 11, 10, 18};
		String[]colors = {"Brown", "Black", "White", "Orange", "Grey", "Black and brown", "Yellow", "Black", "White and brown", "Colorful"};
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			arr1[i] = new Cat(names[r.nextInt(10)], ages[r.nextInt(10)], colors[r.nextInt(10)]);
		}
		mergeSort(arr1);
		for(int i = 0; i < 10; i++) {
			arr1[i].print();
		}
		
		NonComparableCat[] arr2 = new NonComparableCat[10];
		for(int i = 0; i < 10; i++) {
			arr2[i] = new NonComparableCat(names[r.nextInt(10)], ages[r.nextInt(10)], colors[r.nextInt(10)]);
		}
		System.out.println();
		mergeSort(arr2, new CatComparator());
		for(int i = 0; i < 10; i++) {
			arr2[i].print();
		}
		
		
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
