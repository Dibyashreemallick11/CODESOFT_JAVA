package Com.stringprogram;

public class SplitProgramReverseSentences {
	public static void main(String[] args) {
		String s="java is easy";
		String temp=" ";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			temp+=rev(str[i]);
			temp+=" ";
		}
		System.out.println(temp);
	} 
	 static String rev(String s) {
		String temp=" ";
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		return temp;
				
	}

}
