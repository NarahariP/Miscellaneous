package Test;

import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Before fetching....");
		System.out.println(ListConstant.list());
		System.out.println("Fetching....Done");
		Date releaseDate = ListConstant.getdate();
		System.out.println(releaseDate);
		
		Date hliDate=new Date();
		System.out.println(hliDate);
		
		if(hliDate.after(releaseDate))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
