package Programs;

public class StringReverse {

	public static void CheckStrRevebyforloop(String Str) {

		char[] text = Str.toCharArray();
		for (int i = text.length - 1; i >= 0; i--) {

			System.out.print(text[i]);
		}
		System.out.println();
	}
	
	public static void SubStrinngMentho(String Str) {
		
		
		if(Str==null ||Str.length()<=0) {
			
			System.out.println(Str);
			
		}else {
			System.out.print(Str.charAt(Str.length()-1));
			//SubStrinngMentho(Str.substring(0, Str.length()-1));
		}
		
		
	}
	public static void main(String[] args) {

		CheckStrRevebyforloop("Infosys");
		SubStrinngMentho("TCS");

	}

}
