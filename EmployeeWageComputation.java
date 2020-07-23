import java.util.Random;

public class EmployeeWageComputation{

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args){
        System.out.println("The Salary is : "+ checkEmployeePayment());
    }

    public static int checkEmployeePayment(){
        int hourCount=FULL_DAY_HOUR;
        int dayCount=1;
        int payment=0;
        for(int counter=0;counter<20;counter++) {
            int attendance = takeAttendance();
            switch (attendance){
                case 1 :
                    payment = WAGE_PER_HOUR * FULL_DAY_HOUR + payment;
                    break;
                case 2 :
                    payment = WAGE_PER_HOUR * PART_TIME_HOUR + payment;
                    break;
                default:
                    payment=payment+0;
                    break;
            }
        }
        return payment;
    }

    public static int takeAttendance(){
        Random random = new Random();
        int attendance = random.nextInt(3);
        return attendance;
    }
}
