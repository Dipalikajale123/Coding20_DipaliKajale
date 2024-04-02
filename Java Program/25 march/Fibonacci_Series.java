

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a=0,b=1,num=12;
		for(int i=a;i<=num;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}