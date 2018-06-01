import java.util.Scanner;

public class Ch03Ex03_01 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		double a = Double.parseDouble(input1);
		double b = Double.parseDouble(input2);
		double c = a * b;
		
		int num1 = (int)a;
		int num2 = (int)b;
		int num3 = (int)c;
		
		
		System.out.printf("%d %d", num3, num1 * num2);
}
}