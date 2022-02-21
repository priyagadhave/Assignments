package employeeusecase;
import java.util.Scanner;

public class EmpUC2 {
	
	public static int fullTime=2, partTime=1, workPartTime, workFullTime, workParHrRate,notWork;
	public static double checkEmp;
	
	public static void main(String[] args) {
		System.out.println("");
		
	//random constructor is called here
	 int newrandom = CheckRandom.random();
				   
		 if (partTime ==  newrandom) {   
			
			 //PartTimeWages constructor has called here
			PartTimeWages.partTimeWages( workPartTime, workParHrRate);
						
		}else if (fullTime == newrandom){
			//FullTimeWages constructor has called here
			FullTimeWages.fullTimeWages(workFullTime, workParHrRate);
			
		}else {
			//noPresent constructor has called here
			NoPresent.noPresent(notWork, workParHrRate);
		}

    }
	
}

class CheckRandom {
	public static int random() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}
class PartTimeWages {
   public static void partTimeWages(int workPartTime ,int workParHrRate) {
		
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
class FullTimeWages {
	public static void fullTimeWages(int workFullTime, int workParHrRate) {
		
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
class  NoPresent{
	 public static void noPresent(int notWork, int workParHrRate) {
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter value of employee has done work as rate per hours ");
				workParHrRate =  input.nextInt();
			}
	    	
	    	notWork = 0;
	  		
	    	int wages= notWork*workParHrRate;
	    	System.out.println("employee is presnt and wages is " + wages);	
		}
}