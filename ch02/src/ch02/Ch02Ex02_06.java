package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1= scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3= scanner.nextLine();
		String input4 = scanner.nextLine();
		float num1 = Float.parseFloat(input1);	// 입력받은 문자열을 숫자로
		float num2 = Float.parseFloat(input2);	// 입력받은 문자열을 숫자로
		float num3 = Float.parseFloat(input3);	// 입력받은 문자열을 숫자로
		float num4 = Float.parseFloat(input4);	// 입력받은 문자열을 숫자로
		System.out.printf("%4.1fyd = %5.1fcm\n",num1,num2);
		System.out.printf("%4.1fin = %5.1fcm\n",num3,num4);
}
	
}