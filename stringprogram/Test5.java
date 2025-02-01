package Com.stringprogram;

public class Test5 {
	public static void main(String[] args) {
		String s="success";
		consecutiveLetters(s);
		
	}
	
	public static void consecutiveLetters(String s) {
		StringBuilder s1=new StringBuilder();
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s1.append(s.charAt(i)).append(s.charAt(i+1)).append(" ");
			}
		}
		System.out.println("consecutive Letters:"+ s1.toString());
		
	}
}
  