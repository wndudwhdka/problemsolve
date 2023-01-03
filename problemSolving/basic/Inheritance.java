class A{
	String aField = "클래스 A 필드";
	String aMember = "클래스 A 맴버"; 
	public void aMethod() {
		System.out.println(this.aField);
		System.out.println(aMember);
	}
}

class B extends A // B는 A로 부터 상속받는다. 자식,하위, 서브 클래스로 일컫는다
{
	String bField = "클래스 B 필드";
	String bMember = "클래스 B 맴버";
	public void bMethod() {
		System.out.println(this.bField);
		System.out.println(bMember);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.aMethod();
		B b = new B();
		b.bMethod();
		
		// 부모,상위,슈퍼 클래스로 부터 상속받은 함수 
		b.aMethod();
	}

}
