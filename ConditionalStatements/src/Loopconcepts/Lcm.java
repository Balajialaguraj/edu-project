package Loopconcepts;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the two numbers");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int g=0;
		for(int i=1; i<=1; i++)
		{
			if(a%i==0&&b%i==0)
				g=i;
		}
		int lcm = a&b/g;
		System.out.println("LCM ="  + lcm);
	}

}
