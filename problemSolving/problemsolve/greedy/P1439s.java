package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1439s {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		char cur = s.charAt(0); 
		int cnt0 = 0; // 덩어리의 개수
		int cnt1 = 0; // 덩어리의 개수 
		if(s.charAt(0)=='1') cnt1++;
		else cnt0++;
		
		for(int i=1;i<s.length();i++)
		{	
			if(cur==s.charAt(i)) // 앞문자가 뒤문자와 같을
			{
				
			}
			
			else { // 앞뒤가 다를경우
				if('0'==s.charAt(i)) //뒤가 0이면
				{
					cur = s.charAt(i);
					cnt0++;
					
				}
				
				if('1'==s.charAt(i)) //뒤가 0이면
				{
					cur = s.charAt(i);
					cnt1++;
				}
			}
				
		 }
		
		
		
		
		
		if(cnt0==0||cnt1==0) System.out.println(0);
		else if (cnt0>cnt1) System.out.println(cnt1);
		else if (cnt1>cnt0) System.out.println(cnt0);
		else System.out.println(cnt1);
		
		

		
		
		
	}

}
