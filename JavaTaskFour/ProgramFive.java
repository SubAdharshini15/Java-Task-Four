package JavaTaskFour;

import java.util.Scanner;

public class ProgramFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numner");
		int n = sc.nextInt();
		System.out.println("Number::" + n);
		boolean isprime = true;

		if (n < 2) {
			isprime = false;
         }
		else {
			for(int i = 2;i<n;i++) {
				if(n%i == 0) {
					isprime = false;
					break;
				}
			}
		}
		String Result = isprime ? "Prime" : "NotPrime";
		System.out.println("Entered Numner "+n+" is::" +Result);
		
	}
}
