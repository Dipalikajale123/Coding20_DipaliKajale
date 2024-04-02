
public class Reverse_Number {
	public static void main(String[] args) {
		int num=987654321;
		int reversenumber=0;
		while(num!=0) {
			int digit=num%10;
			reversenumber=reversenumber*10+digit;
			num/=10;
		}
		System.out.println("reverse Number:"+reversenumber);
	}


}
