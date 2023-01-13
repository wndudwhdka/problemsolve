import java.util.Random;

public class MathClass{
	public static void main(String[] args) {
		//  Math 클래스
		//  생성자를 private 선언하여 생성자 선언 자체를 막아두었다.
		//- 생성자 없음(아예 생성이 불가/미리 생성해두었거나 대행해주는 경우)
		//- 이 클래스는 모든 필드와 메소득 static이므로 첫 번째 경우라 볼 수 있다. 
		//- 아무데서나 편하게 부를 수 있는 일회용 계산 클래스
		
		// Math a = new Math(); Math 클래스는 생성자가 private으로 선언되어 있어서 인스턴스
		// 선언이 불가능하다. 
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	
		
		System.out.println(Math.round(1.5));
		System.out.println(Math.floor(1.1123));
		System.out.println(Math.abs(-1230));
		System.out.println(Math.ceil(10.01));
		
		
		System.out.println(Math.abs(50-20));
		System.out.println(Math.abs(20-50));
		
		Random r = new Random();
		int a = r.nextInt(6) + 1; 
		int b = r.nextInt(6) + 1; 
		System.out.println("a = "+ a + ", b = "+ b);
		System.out.println("max = "+Math.max(a, b)+", min ="+Math.min(a,b));
		
		System.out.println(Math.pow(2,10)); // 제곱 
		
		
		
	}
}
