import java.util.Random;
import java.util.*;
public class EmployeeWageComputation{

    public static void main(String[] args){

         System.out.println("Enter the number of companies:");
         Scanner scan = new Scanner(System.in);
         int companyCount=scan.nextInt();
         scan.nextLine();

         for(int i=1;i<=companyCount;i++){

         System.out.println("Enter the Company Name :");
         String companyName = scan.nextLine();

         System.out.println("Enter wage per hour for the company "+companyName+" :");

         int WAGE_PER_HOUR=scan.nextInt();

         System.out.println("Enter Full day hour");
         int FULL_DAY_HOUR=scan.nextInt();

         System.out.println("Enter part time hour ");
         int PART_TIME_HOUR=scan.nextInt();

         System.out.println("enter working day per month ");
         int WORKING_DAY_PER_MONTH=scan.nextInt();
         scan.nextLine();

            checkEmployeePayment(companyName,WAGE_PER_HOUR,FULL_DAY_HOUR,PART_TIME_HOUR,WORKING_DAY_PER_MONTH);
         }
    }


    public static void checkEmployeePayment(String CompanyName, int WAGE_PER_HOUR,int FULL_DAY_HOUR,int PART_TIME_HOUR,int WORKING_DAY_PER_MONTH ){
        System.out.println("The Company Name is :"+CompanyName);
        int hourCount=FULL_DAY_HOUR;
        int dayCount=1;
        int payment=0;
        for(int counter=0;counter<WORKING_DAY_PER_MONTH;counter++) {
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
        System.out.println("The Payment from "+CompanyName+" is : "+payment);
    }


    public static int takeAttendance(){
        Random random = new Random();
        int attendance = random.nextInt(3);
        return attendance;
    }
}


