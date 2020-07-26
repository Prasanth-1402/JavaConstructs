import java.util.Random;

interface IEmployeeWage{
	public void addCompanyEmpWage(String compName, int empRateHour, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeWage();
}


public class EmployeeWageBuilderArray implements IEmployeeWage{
        private int NoOfCompany=0;
        private CompanyEmpWage[] CompEmpWageArray = new CompanyEmpWage[5];

        public void addCompanyEmpWage(String compName, int empRateHour, int numOfWorkingDays, int maxHoursPerMonth){
                CompEmpWageArray[NoOfCompany]=new CompanyEmpWage(compName, empRateHour, numOfWorkingDays, maxHoursPerMonth);
                NoOfCompany++;
        }

        public void computeWage(){
                int totalWage=0;
                for(int i=0;i<NoOfCompany;i++){
                        CompEmpWageArray[i].setEmpWage(this.computeWage(CompEmpWageArray[i]));
                        System.out.println(CompEmpWageArray[i]);
                        }

        }

        public int computeWage(CompanyEmpWage cmpEmpWage){
                int totalempHr=0, empHr=0, totalWorkingHrs=0;
                while(totalWorkingHrs <= cmpEmpWage.numOfWorkingDays){
                        Random random = new Random();
                        int EmpType = random.nextInt(3);
                        switch(EmpType){
                                case 1:
                                                empHr=4;
                                                totalWorkingHrs+=4;
                                                break;
                                case 2:
                                                empHr=8;
                  totalWorkingHrs+=8;
                                                break;
                                default:
                                                empHr=0;
                        }
                        totalempHr=totalempHr+empHr;
                }
                return totalempHr*cmpEmpWage.empRateHour;
        }


        public static void main(String args[]){
                EmployeeWageBuilderArray empArray = new EmployeeWageBuilderArray();
                empArray.addCompanyEmpWage("JIO", 65,15,100);
     				 empArray.addCompanyEmpWage("CTS", 50,35,90);
                empArray.computeWage();
        }
}
