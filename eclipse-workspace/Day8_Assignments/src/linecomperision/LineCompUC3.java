package linecomperision;

import java.util.Scanner;

public class LineCompUC3 {

	public static double x1,x2,y1,y2,x3,y3,x4,y4;
	public static int line1, line2 ,i=2;
	
	public static void main(String[] args) {
		LineOneUC3.lineOne(x1,x2,y1,y2);
		LineTwoUC3.lineTwo(x3,y3,x4,y4);
		
		 //comparing lines
        if (line1 == line2)
       	System.out.println("both lines are equal");
         else if (line1 > line2)
       	System.out.println("line1 is greater");
         else
       	System.out.println("line2 is greater");
		
	}
}
class LineOneUC3{
	public static int lineOne(double x1, double x2, double y1, double y2) {
		int line1, i=2;
	      try(Scanner input = new Scanner(System.in)) {
				
				System.out.println("Enter First Coordinate First point for the First Line");
				x1=input.nextDouble();
				System.out.println("Enter first Coordinate Second point for the First Line");
				x2=input.nextDouble();
				System.out.println("Enter First Coordinate First point for the First Line");
				y1=input.nextDouble();
				System.out.println("Enter first Coordinate Second point for the First Line");
				y2=input.nextDouble();
			}
	      line1=(int)Math.sqrt((x2 - x1) * i + (y2 - y1) * i);
	      System.out.println("Distance of first line = "+line1);
	      return line1;
			
		}
}
class LineTwoUC3{
	
	public static int lineTwo(double x3, double x4, double y3, double y4) {
		
		int line2 ,i=2;
		  try(Scanner input = new Scanner(System.in)) {
					
					System.out.println("Enter First Coordinate First point for the Second Line");
					x3=input.nextDouble();
					System.out.println("Enter first Coordinate Second point for the Second Line");
					x4=input.nextDouble();
					System.out.println("Enter First Coordinate First point for the Second Line");
					y3=input.nextDouble();
					System.out.println("Enter first Coordinate Second point for the Second Line");
					y4=input.nextDouble();
					
				}
					
		  line2=(int)Math.sqrt((x4 - x3) * i + (y4 - y3) * i);
	      System.out.println("Distance of second line = "+line2);
	      return line2;
		}
	
}