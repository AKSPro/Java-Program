package Programs;

import java.util.Scanner;

public class MoveNdigitForword {

	static Scanner sn;

	public static void MoveForword() {
		int Myarrays[] = { 1, 2, 3, 4, 5};

		for (int i = 0; i <3; i++) {
			int j;
			int last = Myarrays[Myarrays.length - 1];
			for (j = Myarrays.length - 1; j >0; j--) {

				Myarrays[j] = Myarrays[j - 1];

			}

			Myarrays[0] = last;
		}
		for (int i = 0; i < Myarrays.length; i++) {

			System.out.print(Myarrays[i] + " ");

		}
		System.out.println();
	}
	

	public static void moveBackword() {

		int Myarrays[] = { 1, 2, 3, 4, 5};

		for (int i = 0; i < 3; i++) {

			int j, first = Myarrays[0];
			for (j = 0; j < Myarrays.length - 1; j++) {

				Myarrays[j] = Myarrays[j+1];

			}

			Myarrays[j] = first;

		}
		for (int i = 0; i < Myarrays.length; i++) {

			System.out.print(Myarrays[i] + " ");

		}

	}

	public static void main(String[] args) {

		MoveForword();
		moveBackword();

	}

}
