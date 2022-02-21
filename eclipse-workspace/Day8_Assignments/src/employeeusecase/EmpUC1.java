
package employeeusecase;
import java.util.Scanner;
import java.util.*;

public class EmpUC1 {
	//public static double checkEmp;
	
	
	public static void main(String[] args) {
		
		int isPresent=1;
		
		System.out.println("employee is presnt or apsent");
		
		Random rand = new Random();
		 int newrandom = rand.random();
		
		if (isPresent == newrandom) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Apsent");
		}
	}
		

	
}
class Random{
	public static int random() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}


		
	



