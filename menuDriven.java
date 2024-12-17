package day4;
import java.util.Scanner;
public class menuDriven {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Choice From 1 to 4");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			int radius=5;
			double area=3.14*radius*radius;
			System.out.println("Area of Circle:" +area);
		    break;
		case 2:
			int base=5;
			int height=5;
			double tringle=1/2 * base * height;
			System.out.println("Area of tringle:" +tringle);
		    break;
		case 3:
			int r=6;
			double Circumferrence=2*3.14*r*r;
			System.out.println("Circumferrence of circle:" +Circumferrence);
		    break;
		case 4:
			int a=2;
			int b=4;
			int c=6;
			double Perimeter= a+b+c;
			System.out.println("Perimeter of tringle:" +Perimeter);
		    break;
		default:
			System.out.println("Invalid Choice");
	}

	

	}

}
