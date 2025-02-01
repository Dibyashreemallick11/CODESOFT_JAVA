package Com.stringprogram;
import java.util.Scanner;

public class MissingVowles {
	
	public static void missingVowels(String s) {
		String v = "aeiouAEIOU";
		for(int i=0;i<v.length();i++) {
			char c1 = v.charAt(i);
			boolean flag = true;
			for(char c2: s.toCharArray()){
				if(c1==c2){
					flag=false;
					break;
				} 
			}
			if(flag) System.out.print(c1+" ");
		}
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an String: ");
		String  s = sc.next();
		missingVowels(s);
		
	}

}
