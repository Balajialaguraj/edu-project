package Loopconcepts;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		int original = number;
		int temp;
		int check =0;
		
		while(number>0)
			
		{
			temp = number%10;
			check=check=(temp*temp*temp);
			number= number/10;
			
		}

		if(original == check)
			System.out.println("it is a Armstorng Number");
		
		else
			System.out.println("its not a Armstorng Number");
	}

}
