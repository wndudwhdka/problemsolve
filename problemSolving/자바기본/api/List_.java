package api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ {
	
	public static void main(String[] args) {
		
			//List 생성
			//List<형태> a = new ArrayList<형태>();
			//(주의) 형태는 무조건 클래스여야 한다. 원시형은 Wrapper 클래스로 대체하여 설정
			
			List<String> a = new ArrayList<String>();

			//데이터 추가
			a.add("마리오");
			a.add("루이지");
			a.add("쿠파");
			a.add(3,"와리오"); // 인덱스 3번에 추가 
			//한번에 출력가능
			System.out.println(a);
	
			//포함 검사
			System.out.println(a.contains("피카츄"));

			//개수 검사
			System.out.println(a.size());
			
			//위치 검사
			System.out.println(a.indexOf("루이지"));

			//삭제
			a.remove("마리오");//마리오 데이터와 일치하는 항목을 삭제(이후 데이터가 앞으로 이동)		
			System.out.println(a);
		
	}
}
