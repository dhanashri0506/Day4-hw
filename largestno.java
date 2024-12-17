package day4;

import java.util.Scanner;

public class largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter 1st Number:");
				int a=sc.nextInt();
				
				System.out.println("Enter 2nd Number:");
				int b=sc.nextInt();
				
				System.out.println("Enter 3rd Number:");
				int c=sc.nextInt();
				
				System.out.println("Enter 4th Number:");
				int d=sc.nextInt();
				

		        if ( a > b ) {
		            if ( a > c ) {
		                if ( a > d ) {
		                    System.out.println("gretest no:" +a);
		                }else {
		                	System.out.println("gretest no:" +d);
		                }
		            }
		        }
		        if ( b > c ) {
		            if ( b > d ) {
		            	System.out.println("gretest no:" +b);
		            }else {
		            	System.out.println("gretest no:" +d);
		            }
		        }
		        if ( c > a ) {
		            if ( c > d ) {
		            	System.out.println("gretest no:" +c);
		            }else {
		            	System.out.println("gretest no:" +d);
		            }
		        }
		        if ( d > a ) {
		            if ( d > c ) {
		                if ( d > b ) {
		                	System.out.println("gretest no:" +d);
		                }else {
		                	System.out.println("gretest no:" +b);
		                }
		            }
		        }

			}
	}


