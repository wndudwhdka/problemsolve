package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S4_1051S {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
			
		char[][] arr = new char[N][M];
		for(int i=0;i<N;i++)
		{
			
			String s = br.readLine();
			for(int j=0;j<M;j++)
			{
				
				arr[i][j] = s.charAt(j);
				
			}
		}	

		int n; // 최대 정사각형 한변의 길이
		if(N<M) n = N;
		else n = M; 
		int ans=0; 
		
		while(true)
		{

			for(int i=0;i+n<=N;i++)
			{
				for(int j=0;j+n<=M;j++)
				{
					//System.out.println("i="+i+", j="+j+" arr[i][j]="+arr[i][j]+"arr[i+n-1][j]="+arr[i+n-1][j]+"arr[i][j+n-1]="+arr[i][j+n-1]+"arr[i+n-1][j+n-1]="+arr[i+n-1][j+n-1]);
					if (arr[i][j]==arr[i+n-1][j] && arr[i][j]==arr[i][j+n-1] && arr[i][j+n-1]==arr[i+n-1][j+n-1])
					{
						ans=n*n; 
					}
					
				}
			}
			if(ans>0)break;
			else
			{
				if(n==1) 
				{
					ans = 1;
					break;
				}
				else n--;
			}	
			
		}
		
		System.out.println(ans);
		br.close(); 
		sc.close(); 
	}

}
