package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String gender = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int year= Integer.parseInt(input2);
		
		if(gender.equals("M")&&year>=18) {
			System.out.println("MAN");
		}else if(gender.equals("M")&&year<18) {
			System.out.println("BOY");
		}else if(gender.equals("F")&&year>=18) {
			System.out.println("WOMAN");
		}else if(gender.equals("F")&&year<18) {
			System.out.println("GIRL");
			
			
		}
		
}
}