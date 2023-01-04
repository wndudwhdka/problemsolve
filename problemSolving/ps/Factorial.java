import java.util.Scanner; 
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close(); 
	}
	static int factorial(int x)
	{
		if (x==0) return 1;
		return x*factorial(x-1);
	}
}
