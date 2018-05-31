import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d %d", num1+100, num2%10);
		
		// 정수 2개 입력받아 첫번째는 100을 더하고
		// 두번째는 10으로 나눈 나머지를 차례로 출력하는 프로그램을 작성
		
	}
}
