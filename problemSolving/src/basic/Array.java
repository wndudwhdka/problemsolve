package basic;
public class Array {

	int[] abc = {1,2,3,4,5,6,7};
	public static void main(String[] args) {
		
		int[] a = new int[3];
		System.out.println(a.length);
		int[] b = {1,2,3,4,5};
		System.out.println(b.length);
		String[] weeks = {"안녕하세요", "반가워요", "잘있어요"};
		System.out.println(weeks);
		System.out.println(weeks[0]);
		System.out.println(weeks[0].length());
		System.out.println(weeks[1]);
		System.out.println(weeks[2]);
		
		char[] c = {'1',2,3,4,5};
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c.length);
		
		/*
		 자바의 대부분의 배열은 .length or .length()함수를 내재한다. 
		  배열의 선언은 type[] var = new type[숫자]; 혹은 type[] var = {1,2,3,4,5};의 형식으로 선언한다.
		  C언어에서 배열의 주소에 해당하는 것은 java에서 reference이다. 
		 
		 */
	}

}
