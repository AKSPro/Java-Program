package Programs;

public class DuplicateInterger {

	int test[] = { 10, 20, 10, 30, 40, 10 };
	int test2[] = new int[5];
	int no = 0;

	public void DublicateInteger() {

		for (int i = 0; i < test.length; i++) {

			for (int j = i + 1; j < test.length; j++) {

				if (test[i] == test[j]) {

					System.out.print(test[j]);
				}
			}

		}

	}

	public void dublicateWord() {

		String str = "Abc test xyz akhi test abc Abc";

		String[] str2 = str.split(" ");

		for (int i = 0; i < str2.length; i++) {

			for (int j = i + 1; j < str2.length; j++) {

				if (str2[i].equals(str2[j])) {

					System.out.println(str2[j]);
				}
			}
		}
	}

	public void highestNumberofWord() {

		String str = "Iam from Maharashshra";
		String[] str2 = str.split(" ");
		String maxlethWord = "";
		for (int i = 0; i < str2.length; i++) {
			if (str2[i].length() >= maxlethWord.length()) {
				maxlethWord = str2[i];
			}
		}
		 System.out.println(maxlethWord); 
	}
	public void REmoveAlphabate() {

			String str="TEST351";
			String str3=" ";
			char[] str2=str.toCharArray();
			
			for(char i=0;i<str2.length;i++) {
				
			
					
					if(Character.isDigit(str2[i])) {
						
						str3=str3+str2[i];
						
					}
					
					
				
			}
			System.out.println("After remove"+str +" of"+str3);
			
			
	}

	public static void main(String[] args) {

		DuplicateInterger d = new DuplicateInterger();
		d.REmoveAlphabate();

	}

}
