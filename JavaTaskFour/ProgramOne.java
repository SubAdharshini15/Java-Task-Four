package JavaTaskFour;

import java.util.Scanner;

public class ProgramOne {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value a::");
	int a = sc.nextInt();
	System.out.println("a ::"+a);
	System.out.println("Enter the value b::");
	int b = sc.nextInt();
	System.out.println("a ::"+b);
	System.out.println("Enter the value c::");
	int c = sc.nextInt();
	System.out.println("a ::"+c);
	System.out.println("Enter the value d::");
	int d = sc.nextInt();
	System.out.println("a ::"+d);
	int AandB = a+b;
	int CandD = c+d;
	if(AandB > CandD) {
		System.out.println("sum of a and b is greater than sum of c and d");
	}
	else {
		System.out.println("sum of c and d is greater than sum of a and b");
	}
			
	
}
}
