package silver;

import java.util.Scanner;

public class S4_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num1,num2,num3;
		int cnt=99; 
		if(n<100) System.out.println(n);
		else
		{
			for (int i = 100; i <= n; i++) {

				num1 = i / 100;
				num2 = i / 10 % 10;
				num3 = i % 10;
				if ((num1 - num2) == (num2 - num3)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close(); 
	}

}
