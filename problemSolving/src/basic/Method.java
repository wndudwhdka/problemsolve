package basic;

//method 는 소문자로 만들어야한다.
//method는 클래스안에 들어가야 한다. 
// 메소드 끼리 범위가 겹칠 수 없다. 
// 메소드이름은 소문자로 시작해야한다. 

class Student{
	String name;
	int height;
	void setting(String name, int height) // setter 
	{
		this.name = name;
		this.height = height; 
	}
	void print() {
		System.out.println("이름은 "+this.name);
		System.out.println("키는 " +this.height);
	}
	String getName() {  //getter 
		return this.name; 
	}
	int getHeight() {
		return this.height;
	}
}



public class Method {

	static int printhi(int a) {
		System.out.println("Method클래스의 함수");
		return a; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student jj = new Student();
			System.out.println(jj.getName());
			 jj.setting("김김김", 187);
			 System.out.println(jj.getName());
			 jj.print();
			 printhi(10);
	}

}
