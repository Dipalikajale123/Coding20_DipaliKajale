
public class Even_Odd {
	static void CountEvenOdd(int arr[],int arr_size) {
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<arr_size;i++) {
			if((arr[i]&1)==1)
				odd_count++;
			else
				even_count++;
		}
		System.out.println("number of even elements="+even_count);
		System.out.println("number of odd element="+odd_count);
	}
	
public static void main(String[] args) {
	int arr[]= {1,2,4,7,9,5,3,6};
	int n=arr.length;
	CountEvenOdd(arr, n);
	
}

}
