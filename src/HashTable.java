import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
	
	
	public void TestHashTable() {
		
		
		Hashtable<Integer, String> Items=new Hashtable<>();
		
		Items.put(1, "AKS");
		Items.put(2, "TKS");
		Items.put(3, "KVS");
		
		System.out.println(Items);
		
		System.out.println("---Size-------------------------------");
		
		System.out.println(Items.size());
		
		System.out.println("---isEmpty-------------------------------");
		
		System.out.println(Items.isEmpty());
		
		
		System.out.println("---Retrive---by --Enumeration--------------------------");
		
		Enumeration em=Items.keys();
		
		while(em.hasMoreElements()) {
			
			Integer key=(Integer) em.nextElement();
			
			System.out.println(key +"  "+Items.get(key));
			
		}
		
		
	}
	
	
	

}


