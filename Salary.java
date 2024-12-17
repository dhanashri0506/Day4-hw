package day4;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner emp= new Scanner(System.in);
			System.out.println("Enter the name of employee:");
			String name= emp.nextLine();
			System.out.println("Name of employee:");
			double Basicsalary=2000;
			System.out.println("basic salary of employee:" +Basicsalary);
			double Bonus=Basicsalary * 0.4;
			System.out.println(" bonus salary of employee:" +Bonus);
			double Grosssalary= Basicsalary +  Bonus ;
			System.out.println("Gross salary of employee:" +Grosssalary);
	     
		}


}
