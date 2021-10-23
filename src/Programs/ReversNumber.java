package Programs;

import java.util.Scanner;

public class ReversNumber {
	
	
	public static int CheckRevers() {
		
		Scanner sn=new Scanner(System.in);
		
		int no=sn.nextInt();
		
		int REMINDER;
		int REVERSE = 0;
		
		while(no>0) {
			
			REMINDER=no%10;
			REVERSE=REVERSE*10+REMINDER;
			no=no/10;
		}
			
		return REVERSE;
		
	}
	

	public static void main(String[] args) {
		
		int Reverseno=CheckRevers();
		System.out.println("REVERSE "+Reverseno);
		

	}

}
