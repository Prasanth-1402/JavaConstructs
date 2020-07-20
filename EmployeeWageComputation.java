import java.util.Random;

public class EmployeeWageComputation{

	public static void main(String[] args){
			int WAGE_PER_HOUR = 20;
			int FULL_DAY_HOUR = 8;
			int PART_TIME_HOUR = 8;
			Random random = new Random();
			int attendance = random.nextInt(3);  
			if (attendance == 1 ) 	{
				System.out.println("Full Daily Wage is : " + WAGE_PER_HOUR*FULL_DAY_HOUR);
				System.out.println("Employee is Present");  }
			else if(attendance == 2 ){
				System.out.println("Part Time Daily Wage is : " + WAGE_PER_HOUR*PART_TIME_HOUR);
            System.out.println("Employee is Present");  }
			else
				System.out.println("Employee is Absent");
	}
}
