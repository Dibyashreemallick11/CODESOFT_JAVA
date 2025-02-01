package Com.stringprogram;

public class RevWords {
	public static void main(String[] args) {
		String s="java is easy";
		System.out.println(rev(s));
	}
	
	public static String rev(String s) {
		int i =0;
		int j=0;
		String s2=" ";
		while(j<s.length()) {
			while(j<s.length()&&s.charAt(j)!=' ')
				j++;
			String temp=" ";
			int k=j-1;
			while(k>=i) {
				temp+=s.charAt(k);
				k--;
				
			}
			s2+=temp;
			if(j<s.length())
				s2+=" ";
			j++;
			i=j;
		}
		return s2;
	}

}
