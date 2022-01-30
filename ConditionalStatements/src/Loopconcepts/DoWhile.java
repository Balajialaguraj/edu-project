package Loopconcepts;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args)
	
	{
		
		System.out.println("Enter the Limit: ");
		Scanner In =new Scanner(System.in);
		int n=In.nextInt();
		
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while (i<=n);
		
		

	}

}
