package Test;

import java.math.BigDecimal;

public class DoubleTestClass {
	public static void main(String[] args) {
		
		Double a=0.0;
		Double b=0.0;
		
		
		
		
		System.out.println(a.doubleValue());
	}
	
	
	public static void main1(String[] args) {
		
		double actval =0;
		
		BigDecimal actt= new BigDecimal(actval).setScale(3,BigDecimal.ROUND_HALF_UP);
		
		System.out.println(actt);
	}

}
