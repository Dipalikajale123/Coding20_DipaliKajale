package sortarray_firsthalfascending_secondhalfdecending;

import java.util.Arrays;

public class SortArray {
	public static void sortHalf(int[] arr) {
		int mid=arr.length/2;
		Arrays.sort(arr,0,mid);
		Arrays.sort(arr,mid,arr.length);
		for(int i=0,j=arr.length-1;i<j;i++,j++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,2,7,4,1,9,6,3,8};
		sortHalf(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));
	}

}
