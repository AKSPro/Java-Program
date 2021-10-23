import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class SimpleArray {
	
	static Scanner sc=new Scanner(System.in);
	public static void demoArrry() {
		
		int A[]= {1,2,3,4,4};
		System.out.println(A[1]);
		System.out.println("----------------------------");
		for(int i=0; i<A.length;i++) {
			System.out.println(A[i]);
		}
		System.out.println("---------For Each-------------------");
		for(int a:A) {
			System.out.println(a);
		}
		
		int a[]=new int[3];
		
		System.out.println("---------enter ele-------------------");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}	
		
		
		 
	}
	
	public static void ArrayToList() {
		int A[]= {1,2,3,4,4};
		System.out.println("Arrato arrayList number");
		
		List<Integer>list=Arrays.stream(A).boxed().collect(Collectors.toList());
		 
		 System.out.println("Method1 "+list);
		
		 System.out.println("Arrato arrayList String");
		 
		 String as[]= {"Aaks","asda","asdas"};
		 System.out.println(as);
		 List<String>list2=Arrays.asList(as);
		 System.out.println(list2);
		 
		 System.out.println("Metho2");
		 List<String>list3 =new ArrayList<>();
		 Collections.addAll(list3, as);
		 
		 System.out.println(list3);
		
	}
	
	public static void ArrayListToArray() {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Object[] A=list.toArray();
		System.out.println(Arrays.toString(A));
		
		System.out.println("-------------------------------------");
		
		
		ArrayList<String> list2=new ArrayList<>();
		
		list2.add("AKS");
		list2.add("TCS");
		list2.add("Yes");
		String str[]=list2.toArray(new String[list2.size()]);
		
		System.out.println(Arrays.toString(str));
		
	
		
		
	}
	

	public static void main(String[] args) {
		
		//demoArrry();
		//ArrayToList();
		ArrayListToArray();
	}

}
