package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input1 = scanner.nextLine();
		double kg = Double.parseDouble(input1);

		if(kg<=50.80) {
			System.out.println("Flyweight");
		}else {
			if(50.80<=kg && kg<=61.23) {
				System.out.println("Lightweight");
			}else {
				if(61.23<=kg && kg<=72.57) {
					System.out.println("Middleweight");
				}else {
					if(72.57<=kg && kg<=88.45) {
						System.out.println("Cruiserweight");
					}else {
						if(88.45<kg) {
							System.out.println("Heavyweight");
						}

					}
				}
			}
		}
	}
}
