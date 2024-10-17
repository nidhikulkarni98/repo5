package objects;

public class student_obj {
	String name;
	int num;
	
	student_obj(String name , int num){
		this.name=name;
		this.num=num;
		
	}
	
	student_obj(String name){
		this.name=name;
		this.num=num;
	}
	
	student_obj(int num){
		this.num=num;
		this.name = name;
		
	}
	
	
	public void display() {
		System.out.println("Name is "+name);
		System.out.println("Number is "+num);
	}

}
