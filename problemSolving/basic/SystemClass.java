
public class SystemClass {

	public static void main(String[] args) {
		// 프로그램 외부환경(OS)에 대한 정보 및 기능을 제공한다.
		// system 클래스
		//- 생성자 없음(아예 생성이 불가/미리 생성해두었거나 대행해 주는 경우)
		//- Math 클래스와 같은 이유로 생성자가 없다(어디서나 편하게)
		
		
		// system.out과 system.err는 다른 통로를 사용한다.  
		// 따라서 system.out과 같이사용하게 되면 많은 오류를 발생시킨다. 
		System.out.println("hello"); // 표준 출력
		System.err.println("hello"); // 표준 오류 출력
		
		System.out.println(System.getProperties()); // System.getProperties(); 여러속서을 나열
		System.out.println(System.getProperty("java.specification.version")); // 자바 버전
		System.out.println(System.getProperty("user.country")); // 유저 나라
		System.out.println(System.getProperty("user.home"));// 사용자 폴더
		System.out.println(System.getProperty("user.dir")); // 현재 실행 프로젝트 위치
		System.out.println(System.getProperty("os.name"));// 현재 운영체제 반환 
		System.out.println("이름");
		
		System.exit(0); // 프로그램 종료 뒤의 코드는 실행되지 않는다.
		// 0을 넣으면 온전히 종료했다고 알리는 것이다. 
		// 0이면 정상종료 0이 아니면 비정상종료로 프로그램은 생각한다.
		
		System.out.println("이 메세지는 나올까요?");
	}

}
