package Com.stringprogram;

public class ReplaceProgram {
	public static void main(String[] args) {
		

	String s1="developer";

	char[]a = s1.toCharArray();
	for(int i=0;i<a.length;i++) {
		if(a[i]=='v'|| a[i]=='e'||a[i]=='l'||a[i]=='0')
			a[i]='@';
		
		
		
		
	}
	String s=new String(a);
	System.out.println(s);

}
}
