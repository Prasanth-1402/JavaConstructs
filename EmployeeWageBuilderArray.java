import java.util.*;
			
interface IEmployeeWage{
	public void addCompanyEmpWage(String compName, int empRateHour, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeWage();
	public int getTotalWage(String CompName);
}


public class EmployeeWageBuilderArray implements IEmployeeWage{
			 private ArrayList<CompanyEmpWage> CompanyEmpWageArrayList = new ArrayList<>();
			 private Map<String, CompanyEmpWage> EmpWageFromCompany  = new HashMap<>(); 
          
			public void addCompanyEmpWage(String compName, int empRateHour, int numOfWorkingDays, int maxHoursPerMonth){
               	CompanyEmpWage companyEmpWage =new CompanyEmpWage(compName, empRateHour, numOfWorkingDays, maxHoursPerMonth);
						CompanyEmpWageArrayList.add(companyEmpWage);			
						EmpWageFromCompany.put(compName, companyEmpWage);
        }

        public void computeWage(){
                int totalWage=0;
                for(CompanyEmpWage i : CompanyEmpWageArrayList){
								CompanyEmpWage companyEmpWage = i;
                        companyEmpWage.setEmpWage(this.computeWage(companyEmpWage));
								System.out.println(companyEmpWage);
					 }
        }

        public int computeWage(CompanyEmpWage cmpEmpWage){
        int totalempHr=0, empHr=0, totalWorkingHrs=0,dayCount=0;
        HashMap<Integer, ArrayList<Integer>> dailyWage = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> dailyWageArray = new ArrayList<>();
        while(totalWorkingHrs <= cmpEmpWage.maxHoursPerMonth && dayCount <= cmpEmpWage.numOfWorkingDays ){
            Random random = new Random();
            int EmpType = random.nextInt(3);
            switch(EmpType){
                case 1:
                    empHr=4;
                    dayCount++;
                    totalWorkingHrs+=4;
                    break;
                case 2:
                    empHr=8;
                    dayCount++;
                    totalWorkingHrs+=8;
                    break;
                default:
                    dayCount++;
                    empHr=0;
            }
            totalempHr=totalempHr+empHr;
            dailyWageArray.add(totalempHr*cmpEmpWage.empRateHour);
        }
	     dailyWage.put(totalempHr*cmpEmpWage.empRateHour, dailyWageArray);
        System.out.println(dailyWage);
        return totalempHr*cmpEmpWage.empRateHour;
		}

		public int getTotalWage(String CompanyName){
			return EmpWageFromCompany.get(CompanyName).totalEmpWage;
	
		}
        public static void main(String args[]){
                EmployeeWageBuilderArray empArray = new EmployeeWageBuilderArray();
                empArray.addCompanyEmpWage("JIO", 65,15,100);
     				 empArray.addCompanyEmpWage("CTS", 50,35,90);
                empArray.computeWage();
					 System.out.println(empArray.getTotalWage("JIO"));
					 System.out.println(empArray.getTotalWage("CTS"));
        }
}
