package conditionalstatement;

import java.util.Scanner;

public class Example5nestedifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number(except zero(0)): ");
		number = scanner.nextInt();
		
		//outer if-else
		if(number > 0)
		{
			
			//inner if-else
			if(number%2 == 0)
			{
				System.out.println("the number is an even.");
			}
			else
			{
				System.out.println("the number is an odd.");
			}
			
		}
		else
		{
			System.out.println("the number is negative.");
		}
		
		scanner.close();

	}

}
