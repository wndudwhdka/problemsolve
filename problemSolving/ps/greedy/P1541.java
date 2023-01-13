package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] c = new char[s.length()];
		char[] t = new char[5];
		
		
//		for(문자열길이만큼) {
//			if(c[i]=='-')
//			{
//				
//			}
//			else if(c[i]=='+')
//			{
//				
//			}
//			else
//			{
//				자릴수로 더하기 
//			}
//			
//					
//		}
		
		
		for(int i=0;i<s.length();i++)
		{
			c[i] = s.charAt(i);
		}
		
		int e=0; 
		int[] arr = new int[50];
		int arrcnt = 0;
		
//		for(int i=0;i<s.length();i++)
//		{
//			if('0'<=c[i]||c[i]<='9')
//			{
//				arr[arrcnt]
//			}
//		}
		
		
		br.close();
		
		
	}
	
	public int ten(int j) {
		if(j==0) return 1;
		else {
			j--;
			return 10*ten(j);   
		}
	}
	
}
