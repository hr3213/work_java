package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();

		int num = Integer.parseInt(input1);
		
		System.out.println(num);
		if(num<0) {
			System.out.println("minus");
		}
	}
}





