package ch04;

import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.print(" *을 출력할 라인의 수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		for(int i=0; i < num; i++){
			for(int j=0; j < num; j++) {
				if(j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
					
		}
			}
		System.out.println();
		}
	}

}

