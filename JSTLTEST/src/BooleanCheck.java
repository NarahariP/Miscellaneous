
public class BooleanCheck {

	public static void main(String[] args) {
		
		boolean b=false;
		System.out.println(b);
		if(true)
			b=true;
		
		Object o=mange("verify",b);
		boolean bb=(boolean)o;
		System.out.println("After Test:"+o);
	}

	private static Object mange(String string, Object b) {
			System.out.println(b);
		return b;
	}
}
