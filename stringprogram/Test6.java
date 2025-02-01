package Com.stringprogram;

public class Test6 {
	public static void main(String[] args) {
		String s1="aBCD ";
		char[]a=s1.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z')
				a[i]=(char) (a[i]+32);
			else if(a[i]>='a' && a[i]<='z')
			a[i]=(char) (a[i]-32);
		}
		String s2=new String(a);
		System.out.println(s2);
		
			

}
}
