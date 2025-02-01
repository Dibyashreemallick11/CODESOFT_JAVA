package Com.stringprogram;

public class Duplicate2 {
	public static void main(String[] args) {
		String s1="banana";
		char[]a=s1.toCharArray();
		char[]b=new char[s1.length()];
		int k=1;
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				b[i]=a[i];
				continue;
			}
			boolean flag =true;
			for(int j=0;i<i;j++) {
				if(a[i]==b[j]) {
					flag = false;
					break;
							
				}
			}
			if(flag==true)
			{
				b[k]=a[i];
				k++;
			}
		}
	}

}
