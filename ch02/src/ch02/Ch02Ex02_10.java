package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	public static void main(String[] args)	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하시오.>");
		
		String input1 = scanner.nextLine();	
		String input2 = scanner.nextLine();	
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d+%d=%d", num1,num2,num1+num2);
		
		
		
		
}
	
}
	