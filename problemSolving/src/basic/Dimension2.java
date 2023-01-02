package basic;

public class Dimension2 {
		public static void main(String[] args) {	
			
					int[][] array1; //기본선언 초기화 안되어 있음 
					
//					for(int i=0;i<9;i++)
//					{
//						for(int j=0;j<9;j++)
//						{
//							array1[i][j] = (i+1)*(j+1); 
//						}
//					}
					
					int[][] array2 = new int[9][9]; // 개수 맞춰서 선언 자바에선 index 오버플로우가 안됨 c랑 다르게 
					for(int i=0;i<9;i++)
					{
						for(int j=0;j<9;j++)
						{
							array2[i][j] = (i+1)*(j+1); 
						}
					}
					
					for(int i=0;i<9;i++)
					{
						for(int j=0;j<9;j++)
						{
							System.out.print(array2[i][j]);
							System.out.print(' ');
							
						}
						System.out.println();
					}
					
					
					
					
					int[][] array3 = {{1,2,3},{4,5,6}};// 개수 및 변수 지정해서 선언
		}				
					
}
