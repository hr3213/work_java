import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		

		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		int a = num1+5;
		int b = num2*2;		
		
		System.out.printf("width = %d%n",num1+5);
		System.out.printf("length = %d%n",num2*2);
		System.out.printf("area = %d%n",a*b);
				
}
}