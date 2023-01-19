package grammer;

public class Constructor { 

	// 책의 예 
	private String name;
	private String writer;
	private int page; 
	private int price;
	
	// 생성자 오버로딩 동일한 이름의 함수가 여러가지 인자를 통해 실행되는 것 
	// 아무 생성자도 없을 때 실행되는 기본 
	public Constructor() {}
	
	
	//하나의 인자를 받을 때
	public Constructor (String name) {
		this.name = name;
	}
	
	// 위의 생성자와 인자의 형태, 갯수, 순서가 같으므로 생성 불가
//	public Constructor (String writer) { 
//		
//	}

	//위의 생성자와 형태가 달라 실행
	public Constructor (int price) {
		this.price = price;
	}
	
	// 위의 생성자와 개수가 달라 실행 
	public Constructor(String name, String writer) {
			this.name = name;
			this.writer = writer; 
	}
	
	
	public Constructor(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	//위의 생성자와 순서가 달라 실행된다. 
	public Constructor(int price,String name) {
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		

	}

}
