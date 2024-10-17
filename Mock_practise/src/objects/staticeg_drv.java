package objects;

public class staticeg_drv {
	public static void main(String[] args) {
		staticeg s = new staticeg();
		s.b=20;
		s.a=50;
		s.display();
		System.out.println(staticeg.b);//static variable used in other class
		System.out.println(s.a);//non static variable
		
	}

}
