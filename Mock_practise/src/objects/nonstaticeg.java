package objects;

public class nonstaticeg {
	static int m ;
	int a;
	int b;
	
	nonstaticeg(int a , int b){
		this.a=a;
		this.b=b;
	}
	
	public  void display() {
		System.out.println(m);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		nonstaticeg s = new nonstaticeg(2,4);
		s.display();
	}

}
