package Com.stringprogram;

public class SplitProgramPalindromeString {
	public static void main(String[] args) {
		String s="Madam sir Madam";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(ispalindrom(str[i]))
				System.out.println(str[i]);
		}
	}
	static boolean ispalindrom(String s) {
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<j) { 
			if (s.charAt(i)!=s.charAt(j))
			return false;
			i++;
			j--;
			
			
		}
		return true;
	}
}



