package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int cm = Integer.parseInt(input1);
		int kg = Integer.parseInt(input2);
		int Obesity = kg+100-cm;
		System.out.println(Obesity);
		if(Obesity>0) {
			System.out.println("Obesity");
		}
		

	}
}