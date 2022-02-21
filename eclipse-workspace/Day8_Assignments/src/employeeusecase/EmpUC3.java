package employeeusecase;

import java.util.Scanner;

public class EmpUC3 {
	
	public static int isfullTime= 1, ispartTime=2, workParHrRate, workFullTime, workPartTime, wages,notWork;
	
	public static void main(String[] args) {
		
	 	System.out.println("employee is presnt or apsent");
		 int newrandom = Random1.random1();
		
		switch(newrandom){    
	    //case statements within the switch block  
	    case 1:
	    	FullTimeWagesUC3.fullTimeWagesUC3(workFullTime, workParHrRate);
	    break;    
	    case 2:
	    	PartTimeWagesUC3.partTimeWagesUC3(workPartTime, workParHrRate);	   	 
	    break;    
	    default: NoPresentUC3.noPresentUC3(workParHrRate);    
	    }    
		
	}

}
class Random1 {
	public static int random1() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}
class PartTimeWagesUC3 {
   public static void partTimeWagesUC3(int workPartTime, int workParHrRate) {
		
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter value of PartTime employee has done");
			workPartTime =  input.nextInt();
			
			System.out.println("Enter value of employee has done work as rate per hours ");
			workParHrRate =  input.nextInt();
		}
		
		int wages= workPartTime*workParHrRate;
		System.out.println("employee work part time  and wages is " + wages);
		
	}
	
}
class FullTimeWagesUC3 {
	public static void fullTimeWagesUC3(int workFullTime, int workParHrRate) {
		
   	 try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter value of full time employee has done");
		workFullTime =  input.nextInt();
		
		System.out.println("Enter value of employee has done work as rate per hours ");
		workParHrRate =  input.nextInt();
	}
		
		int wages= workFullTime*workParHrRate;
   	    System.out.println("employee is presnt full time and wages is " + wages);	
	}
}
class  NoPresentUC3{
	 public static void noPresentUC3(int workParHrRate) {
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter value of employee has done work as rate per hours ");
				workParHrRate =  input.nextInt();
			}
	    	int wages= 0*workParHrRate;
	    	System.out.println("employee is presnt and wages is " + wages);	
		}
}
