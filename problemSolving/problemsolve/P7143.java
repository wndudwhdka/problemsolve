
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class P7143 {
		public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				int R =  Integer.parseInt(br.readLine()); //행
				int C =  Integer.parseInt(br.readLine()); //열	
				int M =  Integer.parseInt(br.readLine()); //열
				int [][]sharkInfo = new int[M+1][6];
				
				for(int i =1;i<=M;i++)
				{
					for(int j = 1;j<=5;j++)
					{
						sharkInfo[i][j]=Integer.parseInt(br.readLine());
					}
				}
				
				for(int i=1;i<=5;i++)
				{
					
				}
//				a = Integer.parseInt(br.readLine());
				
//				System.out.println(a);
				
			
		

	}

}
