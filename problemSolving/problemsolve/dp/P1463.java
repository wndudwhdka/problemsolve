package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


		// 3으로 나누어 본다. -> 3으로 나눴을 때 나머지가 1인 경우 -1 하고 3으로나눈다.
		// 3으로 나누어 볼때 나머지가 2인경우에는 
		//1  x
		//2  /2 
		//3  /3
		//4  /2 /2 
		//5  -1 /2 /2 
		//6  /3 /2 
		//7  -1 /3 /2
		//8  /2 /2 /2 
		//9  /3 /3 
		//10 -1 /3 /3
		// or /2 -1 /2 /2 
		
		//우선순위 /3 -> -1 > /2 ?
		
		//11 -1 -1 /3 /3 
		//12 /3 /3 /2 /2 
		//13 -1 /3 /3 /2 /2 
		//14 /2 -1 /3 /2 
		//15 /3 -1 /2 /2 
		//16 -1 /3 -1 /2 /2
		//17 -1 + ans[16];
		//18 /3 /3 /2




public class P1463 {
	static int[] dp;
	static int cnt=0; 
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0; 
		
		System.out.println("answer is "+ans(n)); 
		

		
		
//		System.out.println(cnt);
	}
		
	public static int ans(int n) {
		

		if(n==1)
		{
			return cnt; 
		}
		
		else if(n==2)
		{
			cnt++;
			return cnt; 
		}
		
		if(n%3==0) {
			cnt++;
			return ans(n/3); 
		}
		else if(n%2==0) {
			cnt++;
			return ans(n/2);
		}
		else if(n%2!=0&&n%3!=0) 
		{
			cnt++;
			return ans(n-1);
		}
		else
		{
			return cnt; 
		}
		
	}
	
}
