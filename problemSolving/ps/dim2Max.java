
import java.util.Scanner; 
public class dim2Max {

	public static void main(String[] args) {

		// p2566 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		
		int[][] dim = new int[9][9];
		Scanner sc = new Scanner(System.in);
		int max=-1;
		int x=0,y=0;		
		for(int i=0;i<9;i++)
		{
			for(int j=0; j<9;j++)
			{
				dim[i][j]=sc.nextInt();
				if(dim[i][j]>max)
				{
					max=dim[i][j];
					x=i;
					y=j;
				}
			}
		}
		System.out.println(max);
		System.out.print((x+1)+" "+(y+1));
		sc.close();
	}

}
