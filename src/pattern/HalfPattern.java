package pattern;

public class HalfPattern {

	public static void halfDiamond() {

		int no = 6;

		for (int i = 1; i <= no; i++) {

			for (int j = 1; j <= no - i; j++) {

				System.out.print("");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");

			}
			System.out.println();
		}
		
		
		for (int i = no-1; i>0; i--) {

			for (int j = 1; j <= no - i; j++) {

				System.out.print("");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");

			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		halfDiamond();
	}

}
