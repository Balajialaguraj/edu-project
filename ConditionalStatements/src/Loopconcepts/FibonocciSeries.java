package Loopconcepts;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int nextnum ;
		int lenthofseries;
		System.out.println("enter the length of the series");
		
		Scanner scan = new Scanner(System.in);
		lenthofseries = scan.nextInt();
		
		for(int i=0;i<lenthofseries;i++)
			
		{
			System.out.print(num1+ " ");
			nextnum= num1+num2;
			num1 =num2;
			num2=nextnum;
		}
		

	}

}
