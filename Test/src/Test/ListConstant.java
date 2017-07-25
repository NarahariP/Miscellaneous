package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ListConstant {

	private final static String ads[]={"123","234","345"};
	
	public static List<String> list(){
		List<String> l=new ArrayList<String>();
		for (String sas : ads) {
			l.add(sas);
		}
		return l;
	}
	
	private ListConstant(){}
	
	private final static String  date="08/11/2017";
	static Date getdate(){
		Date dd = null;
		SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
		try {
			dd =format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dd;
	}
}