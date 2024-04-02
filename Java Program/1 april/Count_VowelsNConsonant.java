
public class Count_VowelsNConsonant {
	public static void main(String[] args) {
		String s="dipalikajale";
		int vcount=0, ccount=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
				}else if((ch>='a'&&ch<='z')) {
					ccount++;
				}
			}
		System.out.println("number of vowels:"+vcount);
		System.out.println("number of consonant:"+ccount);
		}

}
