package Com.stringprogram;

public class BalanceProgram {
	public static void main(String[] args) {
		System.out.println(isbalanced("[5+{4*(2+3)}]"));
		
	}
	static boolean isbalanced(String arg) {
		String s =" ";
		for(int i=0;i<arg.length();i++) {
			char c=arg.charAt(i);
			if(c=='['||c==']'||c=='{'||c=='}'||c=='('||c==')') {
				s+=c;
			}
			
		}
		System.out.println(s);
		while(s.contains("[]")||s.contains("{}")||s.contains("()")) {
			s=s.replace(" []", " ");
			s=s.replace("{}", " ");
			s=s.replace("()", " ");

		
	}
		return s.length()==0;
		
	}
}



