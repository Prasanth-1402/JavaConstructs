import java.util.*;
public class EmployeeWageComputation{

	public String companyName;
	public int ratePerHr;
	public int numOfWorkingDays;
	public int maxHrsPerMonth;
	public int totalWage;


	public void computeWage(){
		int empHr=0, totalEmpHr=0,totalWorkDays=0;
		while( totalEmpHr<=maxHrsPerMonth && totalWorkDays<=numOfWorkingDays ){
			Random random = new Random();
			int checkEmp = random.nextInt(3);
			switch(checkEmp){
			case 1:
				empHr=4;
				break;
			case 2:
				empHr=8;
				break;
			default:
				empHr=0;
			}
			totalEmpHr=totalEmpHr+empHr;
		}
		totalWage=totalEmpHr*ratePerHr;
		System.out.println(companyName+" PAYS "+totalWage);
	}


	public static void main(String args[]){
		EmployeeWageComputation jio = new EmployeeWageComputation();
		jio.companyName="Jio";
		jio.ratePerHr=50;
		jio.numOfWorkingDays=25;
		jio.maxHrsPerMonth=100;
		EmployeeWageComputation airtel = new EmployeeWageComputation();
		airtel.companyName="Airtel";
                airtel.ratePerHr=40;
                airtel.numOfWorkingDays=20;
                airtel.maxHrsPerMonth=120;
		jio.computeWage();
		airtel.computeWage();
	}
}


