package Com.stringprogram;

public class Test4 {
	public static void main(String[] args) {
		String s1="11isha2927";
		int count=0;
		for( int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='0'&& ch<='9') {
				count++;
			}
			
		}
		System.out.println("No of digit in string :"+count);
	}

}
