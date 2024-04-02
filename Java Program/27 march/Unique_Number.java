import java.util.HashSet;

public class Unique_Number {
	public static void main(String[] args) {
		int arrayWithDuplicates[]= {1,5,3,8,9,7,5,6,2,3,4,5};
		int len=arrayWithDuplicates.length;
		HashSet<Integer>hashSet=new HashSet<>();
		for(int i=0;i<len;i++) {
			if(!hashSet.contains(arrayWithDuplicates[i])) {
				hashSet.add(arrayWithDuplicates[i]);
			
		}
		}
		System.out.println(hashSet);

}
}