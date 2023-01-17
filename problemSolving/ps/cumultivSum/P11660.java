package cumultivSum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[][] arr = new int[N][N];
		
		// 행렬 초기화 +1 주의 
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j] = i+j+1; 
			}
		}
		
		
		
		for(int i=0;i<M;i++) {
		
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j=y1-1;j<y2-1;j++)
			{
				
			}
			
		}
		
		
		
		
		
		
		br.close(); 
				
	}

}

