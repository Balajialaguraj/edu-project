package Loopconcepts;

import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
		System.out.println("enter the number for which the factorial is to be donne");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int fact=1;
		for(int i=1; i<=number; i++)
			
		{
			fact=fact*i;
		}
		System.out.println("factorial is" + fact);
	}

}
