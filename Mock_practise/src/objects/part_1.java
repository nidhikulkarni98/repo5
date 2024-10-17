package objects;

public class part_1 {
	public static void main(String[] args) {
		int a =5;
		int b =6;
		System.out.println(a>b? a + " is greater" : b + " not greater");
		
		System.out.println(a%2==0? true:false);
		
		int c = 30;
		System.out.println(c%5==0&&c%3==0? true:false);
		
		int d = 25;
		System.out.println((d%5==0)&&(d%3==1 && d%2==1)? true:false);
		System.out.println((a%5==0)&& !(a%2==0 && a%3==0)?true:false);
		
		int h = 6;
		int age = 30;
		System.out.println(h>6&&(age>24 && age<=24)?true:false);
		
		double p1=1250+(0.12*1250);
		double p2=1450+(0.12*1450);
		double p3 = p1+p2;
		System.out.println(p3);
		
		
		double total = 3000;
		double pp1= 1200;
		double pp2=1400;
		double plat=100;
		double gst = total - (pp1+pp2+plat);
		double gst_p = (gst*100)/total;
		System.out.println(gst_p);
		
		System.out.println(a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d);
		
		for(int i = 1;i<=3;i++){
			for(int j = 1 ; j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		int [] a = {10,20,30,40,50};
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a.length-1);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		
	}
}
