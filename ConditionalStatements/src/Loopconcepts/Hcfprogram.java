package Loopconcepts;

import java.awt.SystemTray;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Hcfprogram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Two Number:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int g=0;
		
		for(int i=1;i<=a;i++) {
		if(a%i==0&&b%i==0)
				System.out.println(i);
		g=i;

	}
	
	  System.out.println("HCF =" + g);
	
		
}
}