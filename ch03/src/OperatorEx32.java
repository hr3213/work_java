
public class OperatorEx32 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char sighX, sighY, sighZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >=0 ? x : -x;
		absY = y >=0 ? y : -y;
		absZ = z >=0 ? z : -z;
		// (조건) ? (조건이 참일 경우 실행) : (조건이 거짓일 경우 실행)
		sighX = x > 0 ? '+' : (x==0 ? ' ' : '-'); // x의 값이 음수이면, 양수로 만든다.
		sighY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		sighZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", sighX, absX);// 조건 연산자를 통합
		System.out.printf("y=%c%d%n", sighY, absY);
		System.out.printf("z=%c%d%n", sighZ, absZ);
		
			
		
	}
}
