package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_1051 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		for(int i=0;i<N;i++)
		{
			
			String s = br.readLine();
			for(int j=0;j<N;j++)
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
			System.out.println("n은"+n);
			for(int i=0;i+n<=N;i++)
			{
				for(int j=0;j+n<=M;j++)
				{
					System.out.println("arr[i][j]="+arr[i][j]+"arr[i+n-1][j]="+arr[i+n-1][j]+"arr[i][j+n-1]="+arr[i][j+n-1]+"arr[i+n-1][j+n-1]="+arr[i+n-1][j+n-1]);
					if (arr[i][j]==arr[i+n-1][j] && arr[i][j]==arr[i][j+n-1] && arr[i][j+n-1]==arr[i+n-1][j+n-1])
					{
						ans=n*n; 
					}
					
				}
			}
			n--;
			if(n==1) ans=1;	 
			if(ans>0)break;
		}
		
		System.out.println(ans);
		br.close(); 

	}

}
