import java.util.Scanner;

public class Ch03Adv01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("강아지와 병아리의 합과 다리의 수를 입력하시오.>");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int dog = Integer.parseInt(input1);
		int Chick= Integer.parseInt(input2);
		
		System.out.printf("%d %d",dog + Chick, dog*4 + Chick * 2 );
		
}
}