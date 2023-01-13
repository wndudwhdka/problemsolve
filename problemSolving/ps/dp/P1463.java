package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0; 
		System.out.println(ans(n)); 
		

		
		
		System.out.println(cnt);
	}
		
	public static int ans(int n) {
		
		if(n%3==0) {
			return ans(n/3);
		}
		else if(n%2==0) {
			
		}
		else if(n%2!=0&&n%3!=0) return ans(n-1)+1; 
		else {
			return 0; 
		}
	}
	
}
