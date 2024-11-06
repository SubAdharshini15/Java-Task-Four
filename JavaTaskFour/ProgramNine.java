package JavaTaskFour;

import java.util.Scanner;

public class ProgramNine {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	System.out.println("Enter Age: "+age);
	if(age>=60) {
		System.out.println("Senior Citizen");
	}else
	{
		System.out.println("Not a senior Citizen");
	}
}
}
