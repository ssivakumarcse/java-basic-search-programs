package search;

import java.util.*;

public class Bubblesort {

	public static void BubbleSort(int arr[], int n) {
		int temp = 0;
		boolean flag;
		for (int i = 0; i < n; i++) {
			flag = false;
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}

			if (!flag)
				break;

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
		BubbleSort(arr, n);
		System.out.println("After sort:");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
