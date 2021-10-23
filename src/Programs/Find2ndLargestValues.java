package Programs;

public class Find2ndLargestValues {

	public static void main(String[] args) {
		
		int no[]= {10,58,1,14,59,62,12,61};
		
		int Largerst=no[0];
		int SecondLarge=no[0];
		for(int i=0;i<no.length;i++) {
			
			if(no[i]>Largerst) {
				SecondLarge=Largerst;
				Largerst=no[i];
			}else if(no[i]>SecondLarge) {
				
				SecondLarge=no[i];
			}
		}
		
		System.out.println(Largerst);
		System.out.println(SecondLarge);
	}

}
