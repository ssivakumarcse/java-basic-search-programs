package search;

import java.util.Scanner;

public class Neonnum {
	public static boolean neon(int nums, int num) {
		int temp, sum = 0;
		while (nums != 0) {
			temp = nums % 10;
			sum += temp;
			nums = nums / 10;
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int nums = num * num;
		if (neon(nums, num))
			System.out.println(num + " is a neon number");
		else
			System.out.println(num + " is not a neon number");

	}

}
