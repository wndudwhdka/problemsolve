import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaTime {

	public static void main(String[] args) {
		// 1. System.currentTimeMills()
				// 측정용 시간 
				// 1970년 1월 1일 0시 0분 0초(기준시) 부터 
				
				long a =  1970 + System.currentTimeMillis() / 365 / 24 / 60 / 60 / 1000;
				System.out.println("a = "+ a);
				
				// 2. java.util.data
				// 최초의 시간 클래스 
				// 날짜의 출력에 문제가 있다. 
				
				
				Date b = new Date();
				System.out.println("b = " +b);
				
				Date c = new Date(123,1,16);
				System.out.println("c = " +c);
				
				// 3. java.util.Calendar
				// Date를 개선한 클래스
				// 생성 대행 방식을 사용
				// 날짜 계산에 특화 
				Calendar d = Calendar.getInstance();
				System.out.println("d = "+d);
				
				d.set(2023,5,13);
				
				// 4. java.time 패키지
				//- 날짜만, 시간만, 날짜와 시간을 같이 쓰고 싶은 경우에 맞게 구현
				//- 월도 일반적인 방식으로 설정 가능 
				
				LocalDate f = LocalDate.now();
				LocalDate g = LocalDate.of(2023, 1,16);
				
				System.out.println("f = "+f);
				System.out.println("g = "+g);

				
				
				//변환 기본 언어 설정 안바꾸면 기본은 내 시스템의 언어로 표기된다.
				//Locale.setDefault(Locale.US);
				
				Date d1 = new Date();
//				SimpleDateFormat f1 = new SimpleDateFormat("y년 M월 d일 E"); 위랑 아래 코드는 같으나 밑의 코드가 업캐스팅을 한것이고, 주로 실전에서도 저렇게 사용한다.  
				Format f1 = new SimpleDateFormat("y년 M월 d일 E");
				System.out.println(f1.format(d1));
				
				Format f2 = new SimpleDateFormat("a H시 M분");
				System.out.println(f2.format(d1));
				
				Format f3 = new SimpleDateFormat("H:mm:ss");
				System.out.println(f3.format(d1));
				
				Format f4 = new SimpleDateFormat("y-MM-d E H:mm:ss");
				System.out.println(f4.format(d1));
				
				
				
				
				
	}

}
