import java.util.Scanner;

public class ExceptioN {

	public static void main(String[] args) {

		// close가 있는 객체를 선언할때 사용하는 try with resource 구문이다. 종료 시 자동으로
		// 
		try(Scanner sc = new Scanner(System.in);)
		{ // 문제가 생기길 바라는 플랜 트라이 내부에 오류가 두개있으므로 catch를 두 개를 생성한다.
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		if(money <= 0 ) { //자바가 감지하지 모하는 예외상황 customized된 예외상항을 다루기 위해서는  
									  // 예외상황에 대한 클래스를 만들고 던져야한다. 
			throw new Exception("금액은 음수가 될 수 없습니다.");
		}
		
		
		System.out.print("인원 : ");
		int people = sc.nextInt();
		if(people < 0) {				// 임의로 처리한 예외는 강제 예외이다.
			throw new Exception("인원은 음수가 될 수 없습니다.");
		}

		int result = money / people;
		int remain = money % people; 
		
		System.out.println("1인당 "+result+"원");
		System.out.println("짜투리 "+remain+"원");
		
		}
		
		// 1. 잘못된 수 입력시 java.util.InputMismatchException
		// 2. 인원 0 입력 시  java.lang.ArithmeticException
		// 파악한 입력문제는 두 종류이다. 
		
		
		//catch(Throwable e)  --> 예외+오류의 최상위 클래스 쓰면 error와 exception을 모두 다르게 된다. 
		//catch(Exception e)  --> 예외클래스만 가지는 클래스 중 최상위 클래스이다.
		//catch(RuntimeException e) --> exception의 하위 클래스이다. 
		//예외 사항을 확실히 모를때에는 exception으로 예외를 모두 묶어둘 수가 있다. 
		
		
		catch(Exception e) {
			e.printStackTrace();  // 이걸 쓰면 편하게 access할 수 있다.	
		}
		
	
		
		
//		catch(Exception e) { // 예외가 발생하면 반드시 예외 정보가 객체 형태로 전달한다. 
////			System.err.println("오류가 발생했습니다.");
////			System.out.println(e);
////			System.out.println(e.getClass()); // 예외 상황 클래스 제출
////			System.out.println(e.getMessage());// 예외 원인(없으면 null) 
//			if(e.getMessage() !=null)
//			{
//				System.err.println(e.getMessage());
//			}
//			else {
//				System.err.println("오류가 발생했습니다.");
//			}
//		}
//		catch(ArithmeticException e) { // 나누기가 잘못 디었을 때의 플랜B //매개변수 e가 있어야 한다. 
//			System.err.println("인원수는 0일 수가 없습니다.!!!!!");
//		}
			
		
		
	}

}
