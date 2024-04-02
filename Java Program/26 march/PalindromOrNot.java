package palindrom;

public class PalindromOrNot {
	public static boolean 
	isPalindrom(int num) {
		int reversed=0,original=num;
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		return original==reversed;
	}
	public static void main(String[] args) {
		int num=12321;
		System.out.println("is palindrom?: "+isPalindrom(num));
	}

}
