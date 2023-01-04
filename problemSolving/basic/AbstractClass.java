abstract class Pet{
	abstract void walk();
	abstract void balk();
	// abstract int a; 변수는 불가.
	protected void run()
	{
		System.out.println("run run");
	}
}


class Dog extends Pet{
	void walk() // 추상클래스에서 생성했던 abstract void walk를 정의 이작업을 오버라이딩이라고 한다. 
	{
		System.out.println("Dog walk..");
	}
	
	void balk() // 미정의 시 에러.
	{
		System.out.println("waL! waL!");
	}
}

class Cat extends Pet{
	void walk() // 추상클래스에서 생성했던 abstract void walk를 정의 
	{
		System.out.println("Cat walk..");
	}
	
	void balk() // 미정의 시 에러.
	{
		System.out.println("miyaonG~");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.balk();
		Cat cat = new Cat(); 
		cat.balk();
		
	}

}
