package Loopconcepts;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args)
	
	{
		System.out.println("Enter the Number to Check");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		int Orginal = number;
		int Check=0;
		int temp=0;
		while(number>0)
			
		{
			temp=number%10;
			Check = (Check*10)+temp;
			number = number/10;
			
		}

			if(Orginal == Check)
				System.out.println("its Palindrom Number");
			else
				
				System.out.println("The Number is not Palindrom");
	}

}
