import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Input {

	public static void main(String[] args) throws IOException { // BufferedReader쓸려면 꼭해야함 throws IOException
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String s1 = sc.next();//ㅁㄴㅇㄹ
		int i1 = sc.nextInt();//123123
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String s2 = br.readLine();//asdfs 
		int i2 = Integer.parseInt(br.readLine());//123
		


		
		StringTokenizer st = new StringTokenizer(br.readLine());//1 2 3
		// n1, n2, n3는 st에 공백을 두고 입력받은 수들이다. 
		int n1 = Integer.parseInt(st.nextToken()); // 1
		int n2 = Integer.parseInt(st.nextToken()); // 2
		int n3 = Integer.parseInt(st.nextToken()); // 3 
		
		
		System.out.println("Scanner로 인력받은 i1 는 "+i1+"s1 는 "+s1);
		System.out.println("BufferedReader로 인력받은 i2 는 "+i2+"s2 는 "+s2);
		System.out.println("n1 n2 n3는 각각 "+n1+" "+n2+" "+n3);
		
		sc.close();
		br.close();
		
	}

}
