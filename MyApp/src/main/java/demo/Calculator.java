package demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fst number");
		int a=sc.nextInt();
		System.out.println("Enter sec number");
		int b=sc.nextInt();
		System.out.println("Addition:"+Math.add(a,b));
		sc.close();
	}

}
