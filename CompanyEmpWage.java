public class CompanyEmpWage{
	public String compName;
	public int empRateHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String compName, int empRateHour, int numOfWorkingDays, int maxHoursPerMonth){
		this.compName=compName;
		this.empRateHour=empRateHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
}

	public void setEmpWage(int totalEmpWage){
			this.totalEmpWage=totalEmpWage;
	}

	public String toString(){
		return String.format("Company Name: %s and the payment is %d", this.compName, this.totalEmpWage);
	}

}

