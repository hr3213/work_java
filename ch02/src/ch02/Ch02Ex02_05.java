package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로
		float num2 = Float.parseFloat(input2);	// 입력받은 문자열을 숫자로
		System.out.printf("%d * %f = %f", num,num2,num*num2);
}

}