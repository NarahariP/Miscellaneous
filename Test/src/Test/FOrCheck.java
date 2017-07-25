package Test;

public class FOrCheck {
	
	public static void main(String[] args) {
		
		String[] ar ={"5","4"};
		
		String status="true";
		
		for (int i = 0; i < ar.length; i++) {
			String id =ar[i];
			if(!(id.equals("2") || id.equals("3") || id.equals("4"))){
				status="false";
			}
			
		}
		
		System.out.println("status::::"+status);
		
	}
}
