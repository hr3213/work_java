package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("yard?");
		String input1 = scanner.nextLine();
		
		double num = Double.parseDouble(input1);
		
		System.out.printf("%.1fyard = %.1fcm", num, num*91.44);
}
	
}