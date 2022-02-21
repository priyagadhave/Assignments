package employeeusecase;

import java.util.Scanner;

public class EmpUC5 {
	
	public static int isfullTime= 1, ispartTime=2, workParHrRate, workFullTime, workPartTime, wages, notWork, numOfDays=20;
  
	public static void main(String[] args) {
		
		
		System.out.println("employee is presnt or apsent");
	
		    
	for( int day=1; day<=numOfDays; day++) 
	{
		System.out.println("Enter a day number " +day);
		
		 int newrandom = Random5.random5();
		switch((int)newrandom)
			{    
		    //case statements within the switch block  
			 case 1:
				 FullTimeWagesUC5.fullTimeWagesUC5(workFullTime, workParHrRate);
			    break;    
			    case 2:
			    	PartTimeWagesUC5.partTimeWagesUC5(workPartTime, workParHrRate);	   	 
			    break;    
			    default: NoPresentUC5.noPresentUC5(workParHrRate);  
		    }    
	   
	}
	   
	}
}
class Random5 {
	public static int random5() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}
class PartTimeWagesUC5 {
   public static void partTimeWagesUC5(int workPartTime, int workParHrRate) {
		
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
class FullTimeWagesUC5 {
	public static void fullTimeWagesUC5(int workFullTime, int workParHrRate) {
		
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
class  NoPresentUC5{
	 public static void noPresentUC5(int workParHrRate) {
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter value of employee has done work as rate per hours ");
				workParHrRate =  input.nextInt();
			}
	    	int wages= 0*workParHrRate;
	    	System.out.println("employee is presnt and wages is " + wages);	
		}
}

