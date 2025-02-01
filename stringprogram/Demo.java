package Com.stringprogram;

public class Demo {
	public static void main(String[] args) {
		
	
	String s1="aaabbcaa";
	char[]a=s1.toCharArray();
	String s2=" ";
	int i=0;
	char c;
	int count;
	while(i<a.length)
	{
		c=a[i];
		count=1;
		i++;
		while(i<a.length&&a[i]==c) {
			count++;
			i++;
		}
		s2=s2+count+c;
	}
	System.out.println(s2);

}
}

