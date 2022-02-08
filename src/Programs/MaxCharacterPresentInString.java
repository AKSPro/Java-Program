package Programs;

public class MaxCharacterPresentInString {

	public static void CheckMaxMinCharactors() {

		int MAX, MIN;
		String str = "Apple";
		int i, j = 0;
		char stringCharactor[] = str.toCharArray();
		int FrqOccurCharactor[] =new int[str.length()];
		int MiChar = str.charAt(0);
		int MaxChar = str.charAt(0);
		
		for (i = 0; i < stringCharactor.length; i++) {

			FrqOccurCharactor[i] = 1;

			for (j = i+1; j < stringCharactor.length; j++) {

				if (stringCharactor[i] == stringCharactor[j] && stringCharactor[i] != ' '
						&& stringCharactor[i] != '0') {

					FrqOccurCharactor[i]++;
					stringCharactor[j] = '0';
				}

			}

		}
		MAX = FrqOccurCharactor[0];
		MIN = FrqOccurCharactor[0];
		for(int S=0;S<stringCharactor.length;S++) {
			
			System.out.println(stringCharactor[S]);
		}
		
		for (int k = 0; k < FrqOccurCharactor.length; k++) {

			if (MIN > FrqOccurCharactor[k] && FrqOccurCharactor[k]!=0) {

				MIN = FrqOccurCharactor[k];
				MiChar = stringCharactor[k];

			}
			if (MAX < FrqOccurCharactor[k] && FrqOccurCharactor[k]!=0) {

				MAX = FrqOccurCharactor[k];
				MaxChar = stringCharactor[k];

			}

		}
		System.out.println("Min Char "+MiChar);
		System.out.println("Min Char "+MaxChar);
	}

	public static void main(String[] args) {
		
		CheckMaxMinCharactors();

	}

}
