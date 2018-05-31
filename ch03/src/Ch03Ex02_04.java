import java.util.Scanner;

public class Ch03Ex02_04 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();
		
		
		int minsucm = Integer.parseInt(input1);
		int minsukg = Integer.parseInt(input2);
		int gayoungcm = Integer.parseInt(input3);
		int gayoungkg = Integer.parseInt(input4);
		
		
		System.out.printf("%b", minsucm > gayoungcm && minsukg > gayoungkg);
		
}
}