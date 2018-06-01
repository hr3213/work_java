import java.util.Scanner;

public class Ch03Ex03_03 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		
		double num = (double)(a + b + c) / 3;
		
		System.out.printf("%.1f", num);
				
}
}