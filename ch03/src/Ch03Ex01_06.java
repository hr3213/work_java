import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
	
		System.out.printf("%b %b", num1!=0 && num2!=0, num1!=0 || num2!=0);
		
}
}