package search;

import java.util.Scanner;

public class Insertionsort {
	public static void InsertSort(int arr[], int n) {
		for (int i = 1; i <= n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
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
		InsertSort(arr, n);
		System.out.println("After sort:");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
