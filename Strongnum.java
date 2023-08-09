package search;

import java.util.Scanner;

public class Strongnum {
	public static int fact(int nums) {
		if (nums == 1)
			return nums;
		else
			return nums * fact(nums - 1);
	}

	public static boolean Strongnum(int numsss) {
		int temp, sum = 0;
		int numss = numsss;
		while (numss != 0) {
			temp = numss % 10;
			sum += fact(temp);
			numss = numss / 10;
		}

		if (sum == numsss)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (Strongnum(num))
			System.out.println(num + " is a Strong number");
		else
			System.out.println(num + " is not a Strong number");

	}

}
