package Com.stringprogram;

public class Decoding {
	public static void main(String[] args) {
		String s ="bcd";
		String decodestr= decode(s,1);
		System.out.println(decodestr);
		
	}
	static String decode(String s,int l) {
		char[] arr=s.toCharArray();
		char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			int exp =((c-97)-l)%26;
			arr[i]=letters[exp>=0?exp:26+exp];
		}
		return new String(arr);
				
	}

}
