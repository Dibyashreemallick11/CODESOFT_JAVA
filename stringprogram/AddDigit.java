package Com.stringprogram;

public class AddDigit {
	public static void main(String[] args) {
		int sum=0;
		String s="ash123";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum+=(ch-'0');
			}
		}
		System.out.println("The sum of digits in the string is:"+sum);
	}

}
