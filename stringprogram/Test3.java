package Com.stringprogram;

public class Test3 {
	public static void main(String[] args) {
		String s1="Good morning";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		
		System.out.println("Total no.of vowles in a string:"+count);
 	}

}
