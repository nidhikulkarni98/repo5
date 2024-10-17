package objects;

public class chaining {
	chaining(){
		this(20);
		System.out.println("first constructor");
	}
	
	chaining(int a){
		System.out.println("second constructor");
		System.out.println(a);
		
	}

}
