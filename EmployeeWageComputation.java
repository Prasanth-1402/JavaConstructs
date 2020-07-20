import java.util.Random;

public class EmployeeWageComputation{

	public static void main(String[] args){
			Random random = new Random();
			int attendance = random.nextInt(2);
			if (attendance == 1 )
				System.out.println("Present");
			else
				System.out.println("Absent");
	}
}
