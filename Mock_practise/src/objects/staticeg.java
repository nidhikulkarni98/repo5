package objects;

public class staticeg {
	
	static int b;
	int a;
	
	public static void display() {
		System.out.println(b);
		staticeg s =new staticeg();
		s.a = 100000;
		System.out.println(s.a);
	}

}
