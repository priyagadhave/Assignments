package employeeusecase;

public class EmpUC6 {
	
	public static int isfullTime= 1, ispartTime=2, workParHrRate, numOfDays, maxHrsInMonths;

	public static int empHours, totalEmpHrs, totalWorkingDays;
	
	public static double checkEmp;
	
	public static void random() {
		 checkEmp=(int) Math.floor(Math.random() * 10) % 3;
	}
	
	
	public static void main(String[] args) {
		
		
		while( totalEmpHrs <= maxHrsInMonths &&  totalWorkingDays < numOfDays ) {
			totalWorkingDays++;
			
			random();
			
			switch((int)checkEmp)
			{    
		    //case statements within the switch block  
			    case 1:
			    	empHours=8; 
			    break;    
			    case 2:
			    	empHours=4;   	 
			    break;    
			    default:empHours=0;     
		    } 
			totalEmpHrs += empHours;
			System.out.println("Day#:" +totalWorkingDays + "Emp Hours: " +empHours);
		}
		totalWages(empHours, totalEmpHrs, totalWorkingDays);
	}
	
	public static void totalWages(int empHours, int totalEmpHrs, int totalWorkingDays) {
		int totalEmpWages= totalEmpHrs*workParHrRate;
		System.out.println("Total Emp Wgaes" + totalEmpWages);
	}
}
