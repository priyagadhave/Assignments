package linecomperision;
import java.util.Scanner;

public class LineCompUC1 {
	
	public static double x1,x2,y1,y2;
	
	public static void main(String[] args) {
		Distance.distance(x1,x2,y1,y2);
	}

}
class Distance{
public static void distance( double x1, double x2, double y1, double y2) {
	 int distance, i=2;
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter First Coordinate First point");
			x1=input.nextDouble();
			System.out.println("Enter first Coordinate Second point");
			x2=input.nextDouble();
			System.out.println("Enter First Coordinate First point");
			y1=input.nextDouble();
			System.out.println("Enter first Coordinate Second point");
			y2=input.nextDouble();
		}
		
		distance=(int)Math.sqrt((x2 - x1) * i + (y2 - y1) * i);
		 System.out.println("Distance between two points = "+distance);
	}
	
}
