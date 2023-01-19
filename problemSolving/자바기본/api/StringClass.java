package api;

public class StringClass {

	public static void main(String[] args) {
		
		String url = "    www.naver.     com ";
		String URL = url.toUpperCase();
		System.out.println(url);
		System.out.println(URL);
		
		// 처음과 끝 공백제거
		System.out.println(url.trim());
		
		// replace 모든 공백 제거 
		System.out.println(url.replace(" ",""));
		
		// split 모든 공백 제거2 문자열 배열로 반환.
		String[] sArr = url.split("");
		for(String s:sArr)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		url = url.replace(" ","");
		// index 4번 부터 8번까지의 부분 문자열 추출 substring
		System.out.println(url.replace(" ","").substring(4,9));
		
		
		
	}
	
}
