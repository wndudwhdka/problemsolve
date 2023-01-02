package src;
import java.util.Scanner;
import java.lang.*;

public class P19532 {
			public static void main(String[] args) {
				
					int a,b,c,d,e,f,x=0,y=0;
					Scanner sc = new Scanner(System.in);
					
				
					a = sc.nextInt();
					b = sc.nextInt();
					c = sc.nextInt();
					d = sc.nextInt();
					e = sc.nextInt();
					f  = sc.nextInt();
					
					if (a==0) {
						if(e==0) {
							x=f/d;
							y=c/b;
						}
						else
						{
							y=c/b;
							x=(f-e*y)/d;
						}
					}
					if (b==0) {
						if(d==0) {
							x=c/a;
							y=f/e;
						}
						else
						{
							x=c/a;
							y=(f-d*x)/e;
						}
					}
					
					if (d==0) {
						if(b==0) {
							x=c/a;
							y=f/e;
						}
						else
						{
							y=f/e;
							x=(c-b*y)/a;
						}
					}
					if (e==0) {
						if(a==0) {
							x=f/d;
							y=c/b;
						}
						else
						{
							x=f/d;
							y=(c-b*x)/a;
						}
					}
					if(a!=0&&b!=0&&d!=0&&e!=0)
					{
						y = (c*d-f*a)/(b*d-e*a);  
						x=(c-b*y)/a;
					}
					
					
					System.out.print(x);
					System.out.print(' ');
					System.out.print(y);
					
					
				
			}
}
