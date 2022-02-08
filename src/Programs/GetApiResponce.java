package Programs;

import java.util.Arrays;

public class GetApiResponce {

	public static void GetsecondhighestvaluesfromsortedArray() {

		// int array1[]= {1,5,3};
		int array2[] = { 1, 7, 45, 8, 6, 4, 8, 12, 46 };
		int leg = array2.length;
		// int array3[]= {array1.length+array2.length};
		int temp;
		for (int i = 0; i < array2.length; i++) {

			for (int j = i + 1; j < array2.length; j++) {

				if (array2[i] > array2[j]) {

					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}

			}
		}
		System.out.println(array2[leg - 1]);
	}
	
	public static void get2ndHighestAnotherApproch(int[] array) {
		
		
		int size=array.length;
		int second = 0;
		int highest = 0;
		
		for(int i=0;i<size;i++) {
			
			if(array[i]>highest) {
				
				second=highest;
				highest=array[i];
				System.out.println("1st "+highest);
				System.out.println("1st "+second);
				System.out.println("Current Array "+array[i]);
				
			}else if (array[i]>second ) {
				
				
				second=array[i];
				
				System.out.println("1st "+highest);
				System.out.println("2nd "+second);
				System.out.println("Current Array "+array[i]);
			}
		}
		
		System.out.println("highest secondery value "+second);
		
	}

	public static void main(String[] args) {

		int array[] ={20,1,11,15,14,13,31,22};
		GetsecondhighestvaluesfromsortedArray();
		get2ndHighestAnotherApproch(array);

	}

}
