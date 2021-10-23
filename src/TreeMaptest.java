import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMaptest {
	
	
	public static void treemap(){
		
		TreeMap<Integer, String> Item=new TreeMap<Integer, String>();
		Item.put(1, "one");
		Item.put(2, "two");
		Item.put(3, "three");
		Item.put(4, "Four");
		
		System.out.println(Item);
		System.out.println("Size "+Item.size());
		System.out.println("Size "+Item.isEmpty());

		System.out.println("-----first Approch----------------------------------");
		
		for(Map.Entry<Integer, String> en:Item.entrySet()) {
		
			System.out.println(en.getKey()+"  "+en.getValue());
		}
		
		System.out.println("-----second Approch----------------------------------");
		
		Set<Entry<Integer, String>> key=Item.entrySet();
		
		Iterator<Entry<Integer, String>> map=key.iterator();
		
		while(map.hasNext()) {
			
			Map.Entry<Integer, String> map1=(Map.Entry<Integer, String>)map.next();
			
			System.out.println(map1.getKey()+"  "+map1.getValue());
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		treemap();

	}

}
