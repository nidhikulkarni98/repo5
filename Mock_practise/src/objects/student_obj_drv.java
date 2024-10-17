package objects;

public class student_obj_drv {
	public static void main(String[] args) {
		//normal object creation
//		student_obj s = new student_obj();
//		s.name="Nidhi";
//		s.num=89765839;
//		s.display();
//		System.out.println(s.name + " " + s.num);
		
		//parametrised constructor
//		student_obj s1 = new student_obj("Nidhi", 587642356);
//		s1.display();

		
		//constructor overloading
		student_obj s1 = new student_obj("Nidhi", 587642356);
		s1.display();
		
		student_obj s2 = new student_obj("Nidhi");
		s2.num = 234567655;
		s2.display();
		
		student_obj s3 = new student_obj(676543);
		s3.name = "Nidhi";
		s3.display();
		
		
		
		
	}

}
