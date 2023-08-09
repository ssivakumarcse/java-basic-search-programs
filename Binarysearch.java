package search;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static int Binarysearch(int arr[], int key, int first, int last) {

		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] < key)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;

	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		sc.close();
		Arrays.sort(arr);
		int m = arr.length - 1;

		int position = Binarysearch(arr, key, 0, m);
		if (position != -1)
			System.out.println("Element found at index: " + position);
		else
			System.out.println("Element not found");

	}

}
