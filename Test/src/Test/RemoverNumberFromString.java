package Test;

import java.util.ArrayList;
import java.util.List;

public class RemoverNumberFromString {
	public static void main(String[] args) {
		System.out.println("*********getting all the llist of Strings:**********");
		List<String> stringWithNumber = prepareList();
		
		for (String string : stringWithNumber) {
			System.out.println(string.replaceAll("[^a-zA-Z\\s]", "").trim());
		}
	}
	
	private static List<String> prepareList(){
		
		List<String> stringWithNumber = new ArrayList<String>();
		for (int i = 1; i <= 5; i++) {
			String message = new String("00"+i+" 23 Message Narahari");
			System.out.println(message);
			stringWithNumber.add(message);
		}
		return stringWithNumber;
	}
}
