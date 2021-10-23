package Programs;

import java.util.Scanner;

public class CheckPrimeNumber {

	static Scanner sn;

	public static void Isprime(int i) {
		/*/sn = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sn.nextInt();
*/
		if (i == 0 || i == 1) {

			System.out.println("Is not prime");

		} else if (i % 2 == 0) {

			System.out.println(i + " " + "is not prime");

		} else {

			System.out.println(i + " " + "is prime");
		}

	}
	
	public static void check1to100Prime() {
		
		sn = new Scanner(System.in);
		System.out.println("Enter number range");
		int number = sn.nextInt();
		
		for (int i = 2; i < number; i++) {
			
			Isprime(i);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		/*sn = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sn.nextInt();*/
		//Isprime();
		
		check1to100Prime();
	}

}
