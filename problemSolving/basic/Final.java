class Member{
	
	private final String id; 
	public Member(String id)
	{
		this.id = id; 
	}
	Member(){
		this.id = "None";
	}
	String getter() {
		return this.id; 
	}
	
	// setter는 id가 변경 불가능인 final로 선언되었으므로 사용 자체가 불가능하다
//	void setter(String id) {
//		this.id = id;
//	}
	
}

class Member_static{
	
}

public class Final {

	// i를 상수로 할당 
	public static final int i = 10; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member("철수");
		Member m2 = new Member();
		System.out.println(m1.getter());
		System.out.println(m2.getter());
		
	}

}
