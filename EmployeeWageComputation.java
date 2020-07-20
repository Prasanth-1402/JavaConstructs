import java.util.Random;

public class EmployeeWageComputation{

	public static void main(String[] args){
			int WAGE_PER_HOUR = 20;
			int FULL_DAY_HOUR = 8;
			int PART_TIME_HOUR = 4;
			int WORKING_DAY_PER_MONTH = 20;
			int HourCount=FULL_DAY_HOUR;
         int DayCount=1;
         int Payment=0;
			Random random = new Random();
			int attendance = random.nextInt(3);  
			switch (attendance) {
			case 1 :
				while(HourCount < 101 && DayCount < WORKING_DAY_PER_MONTH){
					Payment = WAGE_PER_HOUR*FULL_DAY_HOUR + Payment;
					DayCount++;
					HourCount+=8;	
				}
				System.out.println("FINAL PAY FOR FULL TIME EMPLOYEE :" +Payment);
				break;
			case 2 :
            while(HourCount < 101 && DayCount < WORKING_DAY_PER_MONTH){
               Payment = WAGE_PER_HOUR*PART_TIME_HOUR + Payment;
               DayCount++;
               HourCount+=4;
            }
            System.out.println("FINAL PAY FOR PART TIME EMPLOYEE :" +Payment);
				break;
			default :
				System.out.println("Employee is Absent");
			}
	}
}
