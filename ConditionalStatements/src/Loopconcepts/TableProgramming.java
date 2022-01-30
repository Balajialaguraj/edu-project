package Loopconcepts;

import java.util.Scanner;

public class TableProgramming {

	public static void main(String[] args) {
		
		int number,multiplier;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number:");
	
		number  = scan.nextInt();
		scan.close();
		
		for(multiplier = 1; multiplier <=10; multiplier++) {

			System.out.printf("%d * %d = %d\n", number, multiplier, (number * multiplier) );
			
		}
	}

}
