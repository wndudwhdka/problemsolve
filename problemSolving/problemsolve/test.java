import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		
		String s= "12304";
		System.out.println(s);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = br.readLine(); 
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
				
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s1.charAt(i));
				
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s2.charAt(i));
				
		}	
		
		sc.close();
		br.close(); 
	}
	
}
