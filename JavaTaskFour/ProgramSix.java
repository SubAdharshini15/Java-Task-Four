package JavaTaskFour;

import java.util.Scanner;

public class ProgramSix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number::");
	int num = sc.nextInt();
	System.out.println("Entered Number:: "+num);
	int Result = 1;
	for(int i=1;i <= num;i++) {
		Result = Result*i;
	}
	System.out.println("Factorial of "+num+ " is "+Result);
	
}
}
