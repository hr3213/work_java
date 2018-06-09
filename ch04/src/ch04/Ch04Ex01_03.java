package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();

		int year = Integer.parseInt(input1);
		
		if(20<=year) {
			System.out.println("adult");
		}else {
			System.out.printf("%d year later",20-year);
		}
}
}