package string;

import java.util.Scanner;

public class P1152 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0; 
		String s;
		while(sc.hasNext())
		{
			s = sc.next();
			cnt++;
			System.out.println(cnt);
			System.out.println("반복중");
		}
		System.out.println("끝");
		
		sc.close();
		
	}
}
