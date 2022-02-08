package Programs;

public class ReversString {
	
	
	public static void ReversStringUsingForLoop() {
		
		String str = "Akhilesh Sonar";

		char s[] = str.toCharArray();
		String temp = "";

		for (int i = s.length - 1; i >= 0; i--) {

			temp += s[i];

		}

		System.out.println(temp);
	}
	
	public static void ReversmethodOfStringBuilder() {
		
		String str = "ranoS hselihkA";
		
		StringBuilder str1=new StringBuilder();
		System.out.println(str1.reverse());
		
	}
	
	public static String Recursion(String str2) {
		
		if(str2.isEmpty()) {
			return str2;
		}
		else {
		Recursion(str2.substring(1, str2.charAt(0)-1));
		}
		return str2;
	}
	

	public static void main(String[] args) {
		ReversStringUsingForLoop();
		ReversmethodOfStringBuilder();
		String str="AKSqwqweqw";
		String str2=Recursion(str);
		System.out.println(str2);
	}

}
