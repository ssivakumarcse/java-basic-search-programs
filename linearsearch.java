package search;

import java.util.Scanner;

public class linearsearch {

	public static int search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		sc.close();
		System.out.println(search(arr, key));
	}

}
