
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P23795 {

	public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Scanner sc = new Scanner(System.in);	
//				int a = Integer.toHexString(sc.read)
				
				int sum = 0;
//				int a =0;
				while(true) {
					
					a=Integer.parseInt(br.readLine());
					
					if(a==-1){
						break;
					}
					sum =sum+a; 
					
				}
				System.out.println(sum);
	}

}
