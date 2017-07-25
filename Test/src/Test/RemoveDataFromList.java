package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.LLOAD;


public class RemoveDataFromList {

public static void main(String[] args) {
	
	List<POJO> list=new ArrayList<POJO>();
	
	POJO p1= new POJO(1, "One");
	POJO p2= new POJO(2, "Two");
	POJO p3= new POJO(3, "Three");
	POJO p4= new POJO(4, "Four");
	POJO p5= new POJO(5, "Five");
	POJO p6= new POJO(6, "Six");
	POJO p7= new POJO(7, "Seven");
	POJO p8= new POJO(8, "Eight");
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	list.add(p6);
	list.add(p7);
	list.add(p8);
	
	System.out.println(list);
	
	
	String i[] = {"Three","five","EIGHT","two"};
	System.out.println("length: "+i.length);
	System.out.println("Size"+list.size());
	
	for (int j = 0; j < list.size(); j++) {
		POJO pp=list.get(j);
		
		for (int k = 0; k < i.length; k++) {
			if(pp.getDesc().equalsIgnoreCase(i[k])){
				list.remove(pp);
			}
		}
	}
	
	System.out.println(list);
}
	
}
