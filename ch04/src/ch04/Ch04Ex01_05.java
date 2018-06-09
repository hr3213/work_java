package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		
		if(4.0<=num1 && 4.0<=num2) {
			System.out.println("A");
		}else if(3.0<=num1&&3.0<=num2){
		 			System.out.println("B");
		}else if(num1<3.0 || num2< 3.0 ){
				 System.out.println("C");
			}
			
		}

}
