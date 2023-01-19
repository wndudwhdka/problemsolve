package grammer;
import java.io.IOException;

public class RuntimeClass {

	public static void main(String[] args) throws IOException {
				// Runtime 클래스
				// - 생성자 없음 private로 선언되어 있음
				// - 생성이든 렌탈이든 부탁을 해서 얻어와야 하는 상황
				// - 만들 때 반드시 지켜야 하는 규칙이 있음
				// - 반드시 생성 메소드가 static으로 존재한다. 
				
		
		
				// Runtime r = new Runtime(); 생성자로 생성불가 private 생성자다..
				Runtime r = Runtime.getRuntime(); // 생성의뢰로 생성 
				
				
						
				
				// windows 
				String os = System.getProperty("os.name");
				if(System.getProperty("os.name").equals("Windows 10"))
				{
					// 밑의 코드들은 맥복에서는 안된다.
					r.exec("notepad"); // 메모장을 켜라
					r.exec("calc"); // 전자계산기를 켜라 
					r.exec("cmd /c strat https://www.google.com"); // 사이트를 켜라
				}

				else if(os.startsWith("Mac")) {
					System.out.println("맥북입니다.");
				}
	}

}
