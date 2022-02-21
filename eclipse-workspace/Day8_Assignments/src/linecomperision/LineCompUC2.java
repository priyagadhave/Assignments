package linecomperision;

import java.util.Scanner;

public class LineCompUC2 {

	public static double x1,x2,y1,y2,x3,y3,x4,y4;
	public static int line1, line2 ,i=2;
	
	
	
	public static void main(String[] args) {
		LineOne.lineOne(x1,x2,y1,y2);
		LineTwo.lineTwo(x3,x4,y3,y4);
		
		if( line1==line2 ) {
			System.out.println("both the line's are equval");
		}else {
			System.out.println("both the line's are not equval");
		}
		
	}
}
class LineOne{
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
class LineTwo{
	
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