package JavaTaskFour;

import java.util.Scanner;

public class ProgramTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		System.out.println("Enter Number : " + number);
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.println("Number of digits:: " + count);
	}
}
