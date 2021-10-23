package Programs;

import java.util.Scanner;

public class getMinValueFromMatrix {
	static Scanner sn;

	public static void getMin() {

		sn = new Scanner(System.in);

		int first[][] = new int[3][3];

		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < first.length; j++) {

				first[i][j] = sn.nextInt();
			}
		}
		int max = first[0][0];
		int col = 0;
		int row = 0;

		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < first.length; j++) {

				System.out.print(first[i][j] + " ");

				if (max < first[i][j]) {

					max = first[i][j];
					col = j;
					row = i;
				}

			}
			System.out.println();
		}
		int min = first[0][col];
		int k=0;
		while(k<3) {
			
			if(min>first[k][col]) {
				
				min=first[k][col];	
			}
			k++;
		}
		
		

		System.out.println("row " + row);
		System.out.println("com " + col);
		System.out.println("Maximum " + max);
		System.out.println("Minium " + min);

	}

	public static void main(String[] args) {

		getMin();

	}

}
