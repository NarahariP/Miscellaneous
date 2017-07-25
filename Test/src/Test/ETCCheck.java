package Test;

public class ETCCheck {

	public static void main(String[] args) {
		
		String message= ""
				+ "";
		
		System.out.println(eTCCheckWithString(message));
		
		System.out.println(eTCCheckWithACSII(message));
		
	}
	
	/**
	 * Checking with String methods
	 * @param message
	 * @return
	 */
	public static boolean eTCCheckWithString(String message){
		boolean status = true;
		if(message.contains(":") || message.contains("\t") || message.contains("\n")){
			System.out.println("Checking inside  : ");
		 		status = false;
			}
		return status; 
	}
	
	
	/**
	 * Checking with the ASCII codes
	 * @param message
	 * @return 
	 */
	public static boolean eTCCheckWithACSII(String message){
		boolean status = true;
		char[] messageArray= message.toCharArray();
		for (char ch : messageArray) {
			int ascii =(int)ch;
			if(ascii==9 || ascii==58 || ascii==13){
				
				status=false;
			}
		}
		return status; 
	}
	
	
}
