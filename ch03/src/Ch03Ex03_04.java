import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	String input1 = scanner.nextLine();
	String input2 = scanner.nextLine();
	String input3 = scanner.nextLine();
	
	double a = Double.parseDouble(input1);
	double b = Double.parseDouble(input2);
	double c = Double.parseDouble(input3);
	
	int num1 = (int)a;
	int num2 = (int)b;
	int num3 = (int)c;
	
	int sum = (num1 + num2 + num3);
	int avg = (int)(a + b + c) /3;
	
	System.out.printf("sum %d%n",sum);
	System.out.printf("avg %d",avg);
	
	
}
}