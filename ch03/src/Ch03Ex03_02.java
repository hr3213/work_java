import java.util.Scanner;

public class Ch03Ex03_02 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		
		int num1 = a/b;
		
		double num2 = (double)a/b;
		
		System.out.printf("%d %.2f", num1, num2);
		
		
}
}