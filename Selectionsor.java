package search;

import java.util.Scanner;

public class Selectionsor {

	public static void SelectionSort(int arr[], int n) {

		for (int i = 0; i <= n; i++) {
			int index = i;
			for (int j = i + 1; j <= n; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}

			}
			int small = arr[i];
			arr[i] = arr[index];
			arr[index] = small;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();

		}
		int n = arr.length - 1;
		System.out.println("Before sort:");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		SelectionSort(arr, n);
		System.out.println("After sort:");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
