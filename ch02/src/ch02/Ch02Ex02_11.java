package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {

	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하시오.>");
		String input1 = scanner.nextLine();	
		String input2 = scanner.nextLine();	
		
		float num1 = Float.parseFloat(input1);
		float num2= Float.parseFloat(input2);
		
		System.out.printf("%10.2f",num1);
		System.out.printf("%10.2f",num2);
		System.out.printf("%10.2f",num1+num2);

}
	
}
