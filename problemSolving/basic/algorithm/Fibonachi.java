package algorithm;

import java.util.Scanner; 

public class Fibonachi {

	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		dp = new int[x+1];
		System.out.println(fibo(x));
		sc.close(); 
	}	
	
	static int fibo(int x)
	{
		if(x==0) return 0; 
		if(x==1||x==2) return 1;  
		if(dp[x]!=0) return dp[x]; 
		
		dp[x] = fibo(x-1)+fibo(x-2); //memoization부분 
		return dp[x];
	}
}
