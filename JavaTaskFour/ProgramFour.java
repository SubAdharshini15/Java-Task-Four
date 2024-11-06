package JavaTaskFour;

import java.util.Scanner;

public class ProgramFour {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int temp=0;
	System.out.println("Enter a");
	int a = sc.nextInt();
	System.out.println("a ::"+a);
	System.out.println("Enter b");
	int b = sc.nextInt();
	System.out.println("b ::"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("a::"+a);
	System.out.println("b::"+b);
	
	
}
}
