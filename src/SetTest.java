import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	
	
	public static void SetT() {
		
		Set<Integer> Items=new LinkedHashSet<>();
		Items.add(2);
		Items.add(3);
		
		System.out.println(Items);
		
		Items.add(5);
		Items.add(5);
		Items.add(6);
		Items.add(null);
		Items.add(5);
		for (Integer integer : Items) {
			
			System.out.println(integer);
			
		} 
		
		
		Iterator<Integer>itr=Items.iterator() ;
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
		
	}
	

	public static void main(String[] args) {
		
		SetT();

}
}