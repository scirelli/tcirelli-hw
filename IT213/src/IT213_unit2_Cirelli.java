import java.util.Scanner;

public class IT213_unit2_Cirelli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*********************************************************

		//****Assignment 2 Section 1

		//*********************************************************
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.print("Assignment 2: Section 1 - Number Comparison \n\n");
		System.out.print("Enter first interger: ");
		number1 = input.nextInt();
		System.out.print("Enter second interger: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d = %d%n", number1, number2);
			
		if (number1 != number2)
			System.out.printf("%d <> %d%n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
		
		
		//*********************************************************

		//****Assignment 2 Section 2

		//*********************************************************
		
		double grade;
		System.out.print("Assignment 2: Section 2 - grade \n\n");
		System.out.print("Enter your grade: ");
		grade = input.nextInt();
		
		if (grade >= 60)
			System.out.println("Congratulations, you passed.");
		else
			System.out.println("Sorry, you failed.");
			
		
		//*********************************************************

		//****Assignment 2 Section 3

		//*********************************************************
		
		int month;
		System.out.print("Assignment 2: Section 3 - month \n\n");
		System.out.print("Enter the number of the month: ");
		month = input.nextInt();
		
		if (month == 1)
			{
				System.out.println("The month is January.");
			}
			else if (month == 2)
			{
				System.out.println("The month is February.");
			}
			else if (month == 3)
			{
				System.out.println("The month is March.");
			}
			else if (month == 4)
			{
				System.out.println("The month is April.");
			}
			else if (month == 5)
			{
				System.out.println("The month is May.");
			}
			else if (month == 6)
			{
				System.out.println("The month is June.");
			}
			else if (month == 7)
			{
				System.out.println("The month is July.");
			}
			else if (month == 8)
			{
				System.out.println("The month is February.");
			}
			else if (month == 9)
			{
				System.out.println("The month is September.");
			}
			else if (month == 10)
			{
				System.out.println("The month is October.");
			}
			else if (month == 11)
			{
				System.out.println("The month is November.");
			}
			else if (month == 12)
			{
				System.out.println("The month is December.");
			}
			else 
				System.out.println("Invalid month.");
			
			
		
		//*********************************************************

		//****Assignment 2 Section 4

		//*********************************************************	
		
		int dayOfWeek;
		System.out.print("Assignment 2: Section 4 - The day of the week \n\n");
		System.out.print("Enter the number of the day of the week: ");
		dayOfWeek = input.nextInt();
		
		switch (dayOfWeek)
		{
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;
		case 7:
			System.out.print("Saturday");
			break;
		default:
			System.out.print("Invalid day.");
		}
	}
}
