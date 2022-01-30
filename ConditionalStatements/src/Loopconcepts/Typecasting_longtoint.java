package Loopconcepts;

public class Typecasting_longtoint {

	public static void main(String[] args) {
	
			
				// long value
				long longnum = 10000;

				// explicit type casting from long to int
				int intnum = (int)longnum;
				
				System.out.println("Converted type: "+ ((Object)intnum).getClass().getName());
				System.out.println("Converted int value is: "
								+ intnum);
			}
		


	}


