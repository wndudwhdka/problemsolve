// 인터페이스, 다중 상속 
// 추상클래스 보다 더 추상화된 개념으로 장점으로는 여러 클래스로 부터 하나의 클래스를 상속하여 준다는 점이 있다. 



interface User{
	void name(String name);
}

interface UserHi{
	abstract void hi();
}

interface UserBi{
	abstract void hi();
}



class TestUser implements User,UserHi,UserBi
{
	//추상 메소드는 무조건 재 선언되어햐 한다. 
	String name;
	public void name (String name)
	{
		this.name = name;
	}
	public void hi()
	{
		System.out.println("Hi!");
	}
	public void bi()
	{
		System.out.println("Bye!");
	}
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUser tu = new TestUser();
		tu.name("홍길동");  
		tu.hi();
		tu.bi();
	}

}
