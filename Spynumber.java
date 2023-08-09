package search;

import java.util.Scanner;

public class Spynumber {
	public static boolean Spynum(int nums) {
		int temp, sum = 0, product = 1;
		while (nums != 0) {
			temp = nums % 10;
			sum += temp;
			product *= temp;
			nums = nums / 10;
		}
		if (sum == product)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (Spynum(num))
			System.out.println(num + " is a Spy number");
		else
			System.out.println(num + " is not a Spy number");
		for (int i = 100; i < 10000; i++) {
			if (Spynum(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
