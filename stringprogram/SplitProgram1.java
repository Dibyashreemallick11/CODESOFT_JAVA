package Com.stringprogram;

public class SplitProgram1 {
	public static void main(String[] args) {
		String s= "java is very very easy";
		String temp=" ";
		String []str =s.split(temp);
		for(int i=str.length-1;i>=0;i--) {
			temp+=str[i];
			temp+=" ";
		}System.out.println(temp);
		
	}

}
