package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하시오.>");
		String input1 = scanner.nextLine();	
		String input2 = scanner.nextLine();	
		
		int num1 = Integer.parseInt(input1);	// 입력받은 문자열을 숫자로 변환
		float num2 = Float.parseFloat(input2);	// 입력받은 문자열을 숫자로 변환
		
		System.out.printf("%.2f*%d=%.0f",num2 ,num1, num2*num1);
		
}
	
}