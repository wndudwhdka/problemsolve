package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_11660S {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr= new int[n+1][n+1]; 
		int[][] sumArr= new int[n+1][n+1]; 
		int[] ans = new int[m+1]; 
		int sum =0; 
		// 배열 옮기기
		for(int i=1;i<=n;i++)
		{
			st = new StringTokenizer(br.readLine()); 
			for(int j=1;j<=n;j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
				sum += arr[i][j]; 
				sumArr[i][j] = sum; 
			}
			
		}
		
//		System.out.println("n은 "+n+" m은"+m);
		 
		for(int i=1;i<=m;i++)
		{
			st = new StringTokenizer(br.readLine());
			int x1 =  Integer.parseInt(st.nextToken()); 
			int y1 =  Integer.parseInt(st.nextToken());
			int x2 =  Integer.parseInt(st.nextToken());
			int y2 =  Integer.parseInt(st.nextToken());
			
			// 끝이 붙어있을 떄, 
			ans[i] = sumArr[x2][y2]-sumArr[x1][y1]+ arr[x1][y1];
			
			if(y1!=1&&y1!=y2) // 왼쪽 부분 자르기 (x1이 왼쪽에 붙어 있지 않고 x1과 x2가 다를때)
			{
				for(int j=0;j<x2-x1;j++)
				{
					ans[i] = ans[i] - (sumArr[x1+j+1][y1-1]-sumArr[x1+j][n]);
				}
			}
			if(y2<n&&y1!=y2) // 오른쪽 부분 자르기 
			{
				for(int j=0;j<x2-x1;j++)
				{
					ans[i] = ans[i] - (sumArr[x1+j][n]-sumArr[x1+j][y2]);
				}
			}
			if(y2==y1)  // 둘이 겹칠경우 
			{
				ans[i] = 0; 
				for(int j=0;j<=x2-x1;j++)
				{
					ans[i]+=arr[x1+j][y1];
				}
				 
			}
			//
		}
		
		for(int i=1;i<=m;i++)
		{
			System.out.println(ans[i]);
		}
//		System.out.println(sumArr[3][3]);
		br.close();

	}

}
