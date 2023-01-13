
public class StringBuffeR {
	public static void main(String[] args) {
	
		// 웹에서는 다중 동시 사용자 처리를 위해서 대부분 StringBuffer를 사용한다.
		// thread-safe 구조  : 다중 동시 사용자 환경에서도 안정성이 보장된 구조 
		// 반복되는 별찍기에서 월등한 실행속도를 지닌다. 
		
//		StringBuffer buffer = new StringBuffer(""); 
//		String star = ""; 
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i< 10000000;i++)
//		{
//			buffer.append("*");
//		}
//		long finish = System.currentTimeMillis();
//		System.out.println(finish-start);

		
		// 문자열의 정규식사용
		String regex = "^(.*?)[(검찰)(계좌)(돈)(납치)(송금)(아들)(딸)](.*?)$";
		String s = "경찰입니다. 검찰아님니다.ㅣ";
		System.out.println(s.matches(regex));
		
		String[] filter = new String[] {
				"검찰","송금","계좌","돈","납치","아들","딸"
		};
		
		
		
		
		// StringBuffer를 이욯한 정규식사용 append 메소드를 사용하여서 정규식을 완성시킬 수 있다, 반복문도 활요이 가능하다 
		StringBuffer buffer = new StringBuffer();
		buffer.append("(.*?)");
		buffer.append("(");
		
		for(int i=0; i < filter.length; i++) {
			buffer.append(filter[i]);
			if(i < filter.length-1) {
				buffer.append("|");
			}
		}
		
		buffer.append(")");
		buffer.append("(.*?)");
		
		String regexb = buffer.toString();
		System.out.println(regexb);
		
		if(s.matches(regex)) {
			System.out.println(s);
			System.out.println("-------------");
			System.out.println("주의 : 보이스피싱에 당하지 않게 조심하세요");
		}
		else {
			System.out.println(s);
		}
		
		
	}
}
