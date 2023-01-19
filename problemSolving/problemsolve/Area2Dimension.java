import java.util.Scanner; 

public class Area2Dimension {

	public static void main(String[] args) {
		// p2563 색종이 넓이 구하기 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] spot = new int[n][2]; 
		boolean[][] white = new boolean [100][100];
		
		for(int i=0;i<n;i++)
		{
			spot[i][0] = sc.nextInt();
			spot[i][1] = sc.nextInt();
		}
		
	
		
	
		for(int i=0;i<n;i++)
		{
			for(int j=spot[i][0];j<spot[i][0]+10;j++)
			{
				for(int k=spot[i][1];k<spot[i][1]+10;k++)
				{
					white[j][k] = true; 
				}
			}
		}
		
		int cnt=0; 
		for(int i=0;i<white.length;i++)
		{
			for(int j=0;j<white[i].length;j++)
			{
				if(white[i][j]==true)
				{
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		
		sc.close();
	}

}
