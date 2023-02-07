package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr= new int[n][n]; 
		
		// 배열 옮기기
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine()); 
			for(int j=0;j<n;j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
//		System.out.println("n은 "+n+" m은"+m);
		 
		for(int i=0;i<m;i++)
		{
			st = new StringTokenizer(br.readLine());
			int x1 =  Integer.parseInt(st.nextToken()); 
			int y1 =  Integer.parseInt(st.nextToken());
			int x2 =  Integer.parseInt(st.nextToken());
			int y2 =  Integer.parseInt(st.nextToken());
			System.out.println(x1);
			System.out.println(y1);
			System.out.println(x2);
			System.out.println(y2);
			
			
			int sum =0; 
			for(int j=x1-1;j<=x2-x1;j++)
			{
				for (int k = y1-1; k <= y2 - y1; k++) {
					
					sum += arr[j][k]; 
				}
			}
			System.out.println(sum);
			
			
		}
		
		br.close();

	}

}
