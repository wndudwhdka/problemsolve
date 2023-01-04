import java.util.Scanner; 

public class Dp {

	static int[] dp; 
	static int cnt = 0; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(n+"번째의 원소는 "+fibo(n)+"입니다.");
		sc.close();
	}
	static int fibo(int x) {
		if(x==1||x==2) return 1; 
		if(dp[x]!=0)
		{
			System.out.println("dp[x]의 호출입니다. x는 "+x+"입니다");
			return dp[x];
		}
		cnt++; 
		System.out.println("총 "+cnt+"번");
		dp[x] = fibo(x-1) + fibo(x-2); 
		return dp[x]; 
			
	}
	

}
