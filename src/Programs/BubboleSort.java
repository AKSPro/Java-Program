package Programs;

public class BubboleSort {

	public static void main(String[] args) {
		
		
		int Numbers[]= {10,25,9,15,16,2,45,5,55};
		
		for(int i=0; i<Numbers.length;i++){
			
			for(int j=1;j<Numbers.length-i;j++) {
				
				if(Numbers[j-1]>Numbers[j]) {
					int temp=Numbers[j];
					Numbers[j]=Numbers[j-1];
					Numbers[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<Numbers.length;i++) {
			
			System.out.println(Numbers[i]);
			
		}
		

	}

}
