package Test;

import java.util.ArrayList;
import java.util.List;


public class CollectionTest  {

	public static void main(String[] args) {
		
		POJO s1= new POJO(1,"ABCD");
		POJO s2= new POJO(2,"EFGH");
		POJO s3= new POJO(3,"IJKL");
		POJO s4= new POJO(4,"MNOP");
		
		List<POJO> list= new ArrayList<POJO>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("Original List :"+list);
	
	String r1= new String("ABCD");
	String r2= new String("EFGH");
	
	List<POJO> newList= new ArrayList<POJO>();
	
	for (POJO p : list) {
		if (check(p.getDesc())) {
			newList.add(p);
		}
	}
	list.clear();list.addAll(newList);
	
	System.out.println("New List :"+newList);
	System.out.println("After Merging Original List :"+list);
	
	}	
	
	static boolean check(String name){
		boolean test = true;
		if(name.equalsIgnoreCase("ABCD") || name.equalsIgnoreCase("EFGH"))
			test = false;
		return test;
	}
	
}
