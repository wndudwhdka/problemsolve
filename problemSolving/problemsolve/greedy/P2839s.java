package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2839s {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		 
		
	
		
		
		if(n==4||n==7)
		{
			System.out.println(-1);
		}
		
		else if(n%5==0){
			System.out.println(n/5);
		}
		
		
		else {
			// 5의 배수와 3의 배수의 합으로 나누어 떨어지는 경우			
			final int one = n % 10;
			switch(one) {
						// 5로 나누어 떨어지는 경우
						//  일의 자리 완성하는법 
						//	1	11  5-1개, 3-2개 3개  
						//  2   12  	  3-4개  4개
						//	3   3         3-1개  1개
						//  4   14  5-1개, 3-3개 4개
					case 1:
						System.out.println(n/5-1+2);
						break;
					case 2:
						System.out.println(n/5-2+4);
						break;
					case 3:
						System.out.println(n/5+1);
						break;
					case 4:
						System.out.println(n/5-1+3);
						break;
						//	6	6	       3-2개 2개
						//	7	17  5-1개   3-4개 5개 
						//  8   8   5-1개  3-1개  2개 
						//  9   9		   3-3개 3개 
					case 6:
						System.out.println(n/5-1+2);
						break;
					case 7:
						System.out.println(n/5-2+4);
						break;
					case 8:
						System.out.println(n/5+1);
						break;
					case 9:
						System.out.println(n/5-1+3);
						break;
						}	
				}
			
			
		}
}


