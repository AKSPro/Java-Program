import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	
	
	
	public void ArrayLis() {
		
		ArrayList<Integer> Item=new ArrayList<Integer>();
		
		Item.add(1);
		Item.add(2);
		Item.add(200);
		Item.add(100);
		Item.add(50);
		
		System.out.println("--------------------------------");
		System.out.println(Item);
		
		System.out.println("--------------------------------");
		
		Item.add(2, 10);
		System.out.println(Item);
		
		System.out.println("Size-------------");
		System.out.println(Item.size());
		
		System.out.println("IsEmpty-------------");
		System.out.println(Item.isEmpty());
		
		System.out.println("Retrive--simeple for loop-----------");
	
		for (Integer integer : Item) {
			
			System.out.println(integer);
			
		}
		
		
		System.out.println("Retrive--by Itrator-----------");
		
		Iterator<Integer>it=Item.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		System.out.println("sort-----------");
		
		Collections.sort(Item);
		
		System.out.println(Item);
		
		  CopyList(Item);
		
	}

	public void CopyList(ArrayList<Integer> Item) {
		
		ArrayList<Integer> value=new ArrayList<>(Item);
		
		System.out.println("New list " +value);
	}
	

}
