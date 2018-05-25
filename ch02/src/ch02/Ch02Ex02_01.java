package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num = Integer.parseInt(input);//  input이라는 스트링을 integer(정수)형태로 변환
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		
		System.out.printf("%s ", "kor");
		System.out.printf("%d%n",num);
		System.out.printf("%s ", "mat");
		System.out.printf("%d%n", num1);
		System.out.printf("%s ", "eng");
		System.out.printf("%d%n", num2);
		System.out.printf("%s ", "sum");
		System.out.printf("%s%n", num+num1+num2);
		System.out.printf("%s ", "avg");
		System.out.printf("%s%n",(num+num1+num2) /3);
	}



}