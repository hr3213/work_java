package ch02;
import java.util.Scanner;
public class Ch02Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환
		int num1 = Integer.parseInt(input1);	// 입력받은 문자열을 숫자로 변환
		System.out.printf("%d%n", num);
		System.out.printf("%d%n", num1);
}
}