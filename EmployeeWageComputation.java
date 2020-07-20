import java.util.Random;

public class EmployeeWageComputation{

	public static void main(String[] args){
			int WAGE_PER_HOUR = 20;
			int FULL_DAY_HOUR = 8;
			int PART_TIME_HOUR = 8;
			int WORKING_DAY_PER_MONTH = 20;
			Random random = new Random();
			int attendance = random.nextInt(3);  
			switch (attendance) {
			case 1 :
				System.out.println("Full Monthly Wage is : " + WORKING_DAY_PER_MONTH*WAGE_PER_HOUR*FULL_DAY_HOUR);
				System.out.println("Employee is Present");  
				break;
			case 2 :
				System.out.println("Part Time Monthly Wage is : " + WAGE_PER_HOUR*WORKING_DAY_PER_MONTH*PART_TIME_HOUR);
            System.out.println("Employee is Present");  
				break;
			default :
				System.out.println("Employee is Absent");
			}
	}
}
