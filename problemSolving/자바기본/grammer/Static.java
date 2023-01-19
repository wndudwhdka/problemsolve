package grammer;
// static은 함수만 사용하고 싶을 때 사용하면 좋다. 
// class이름.함수 사용할 수 있게 해준다
// static 함수는 인스턴스.맴버 변수에 접근하는것이 아닌 클래스명.맴버 변수로 접근해야 한다. 

class Useofstatic
{
	static int plus_static(int a)
	{
		System.out.println("a는 "+(a+1)+"입니다");
		return 2; 
	}
	
	int plus(int a)
	{
		System.out.println("a는 "+(a+1)+"입니다");
		return 2; 
	}
	
}

class Galaxy_static
{
	private static String company="삼성";
	
	static void setter(String company) {
		Galaxy_static.company=company; // 객체 내의 함수를 static으로 선언하면 객체의 private field 데이터에 접근할 때 this가 아닌 클래스 명을 적어야한다.  
	}
	
	static String getter() {
		return Galaxy_static.company;
	}
}

class Galaxy
{
	private String company;
	
	void setter(String company) {
		 this.company=company;
	}
	
	String getter() {
		return this.company;
	}
}


public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//기본 사용예
		//static을 쓸때
		Useofstatic.plus_static(3);
		
		//static을 안쓸때 클래스의 객체를 따로 만들어서 함수를 호출해야한다. 
		Useofstatic instance = new Useofstatic();
		instance.plus(3);
		
		//--------------------------------------------------------
		
		//응용예
		
		Galaxy g1 = new Galaxy();
		Galaxy g2 = new Galaxy();
		g1.setter("Samsung");
		g2.setter("LG");
		
		
		
		Galaxy_static s1 = new Galaxy_static();
		Galaxy_static s2 = new Galaxy_static();
		
		// static 형식의 setter는 만들어지는 모든 instance의 내부 데이터를 settting한다.  
		Galaxy_static.setter("Samsung");// static 함수 호출 시에도 클래스 명으로 함수를 호출해야한다. 
		System.out.println(Galaxy_static.getter());
		System.out.println(s2.getter());// 이렇게하면 
		Galaxy_static.setter("LG");
		System.out.println(Galaxy_static.getter());
		System.out.println(s1.getter());
		
		// setting 이후에 만들어지는 인스턴스 또한 기존에 set되었던 값으로 적용된다. 
		Galaxy_static s3 = new Galaxy_static();
		System.out.println(s3.getter());
		
		
		
		
	}

}
