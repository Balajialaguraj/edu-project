package Loopconcepts;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args)
	{
		 System.out.println("Enter the Limit: ");
		 
		 Scanner in =new Scanner(System.in);
		 int n=in.nextInt();
		 
		 int i=1;
		 while(i<=n)
		 {
			 System.out.println(i);
			 i++;
		 }
		 

	}

}
