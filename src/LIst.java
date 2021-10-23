import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LIst {
	
	
	public static void listTest() {
		
		List<Integer> Numbers=new ArrayList<>();
		
		Numbers.add(null);
		Numbers.add(null);
		Numbers.add(2);
		System.out.println(Numbers);
		
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(3);
		Numbers.add(4);
		
		System.out.println(Numbers);
		
		System.out.println("----Retrive from 2nd possion-----");
		
		System.out.println(Numbers.get(2));
	}
	
	public static <T> void ListListTest() {
		
		List<T> LinnkList=new LinkedList<T>();
	
		
	}

	public static void main(String[] args) {
		listTest();
		ListListTest();
		
		
		
		

	}

}
