
public class OperatorEx17 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi);
		/*연산자 우선순위
		 * 1. 갈호 먼저
		 * 형 변환
		 * 사칙연산 순
		 */
	}
}
