package Programs;



public class ShiftZetoInLast {
	
	
	public static void Shiftzero(int[] no) {
		
		int NewArray[]=new int[no.length];
		int temp=0;
		for(int i=0; i<no.length;i++) {
			
			if(no[i]!=0) {
				//temp=no[i];
				NewArray[temp]=no[i];
				temp++;
			}
		}
		
		for(int i=0; i<NewArray.length;i++) {
			
			System.out.print(NewArray[i]+" ");
			
		}
		
		
	}
	
	

	public static void main(String[] args) {

		int [] no= {0,0,0,0,5,3,3};
		Shiftzero(no);

	}

}
