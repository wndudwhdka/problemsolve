
public class StringBuildeR {

	public static void main(String[] args) {

		
		//  non-thread-safe 구조  : 대기줄을 세우지 않고 동시다발적으로 처리하는 구조(처리x) 
		
		StringBuilder buffer = new StringBuilder(""); 
		String star = ""; 
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i< 10000000;i++)
		{
			buffer.append("*");
		}
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		
	}

}
