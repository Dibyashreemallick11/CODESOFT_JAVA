package Com.stringprogram;

public class AnagramProgram {
	public static void main(String[] args) {
		System.out.println(isAnagram("ramana","amaran"));
		
	}
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())return false;

		while(true) {
			if(s1.length()==0 && s2.length()==0)return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"", "" );
			s2=s2.replace(ch +"","");
		}
	}

}
