package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();	
		
		int num1 = Integer.parseInt(input1);	// 입력받은 문자열을 숫자로 변환
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		System.out.printf("%s ", "sum");
		System.out.printf("%s%n", num1+num2+num3);
		System.out.printf("%s ", "avg");
		System.out.printf("%s%n",(num1+num2+num3) /3);

}
	
}