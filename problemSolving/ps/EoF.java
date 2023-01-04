import java.util.Scanner; 
public class EoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		while(sc.hasNext()) { //sc.hasNext()를 통해 eof를 판단할 수 있다. 
		n1 = sc.nextInt();
		n2 = sc.nextInt(); 
		System.out.println(n1+n2);
		}
		sc.close(); 
	}

}
