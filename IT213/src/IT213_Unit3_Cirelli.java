import java.util.Scanner;

public class IT213_Unit3_Cirelli {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		//*********************************************************

		//****Assignment 3 Section 1

		//*********************************************************
	
		System.out.print("Assignment 3: Section 1 \n");
		int grade = 0;
		int total = 0;
		int gradeCounter = 1;
		int average = 0;
		
		while (gradeCounter <=10){
			System.out.print("Enter grade: ");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		average = total/10;
		
		System.out.printf("\nTotal of grade: %d%n", total);
		System.out.println("Average grade: " + average);
		
		//*********************************************************

		//****Assignment 3 Section 2

		//*********************************************************
		
		System.out.print("\n\nAssignment 3: Section 2 \n");
		for (int k = 5; k >= 1; k--) {
			for (int i = 0; i <= 10; i+=2) {
				System.out.printf("k = %d, i = %d\n", k, i);
			}
		}
		//*********************************************************

		//****Assignment 3 Section 3

		//*********************************************************
	
		System.out.print("\n\nAssignment 3: Section 3 \n");
		int number = 0;
		int totalNumber = 0;
		
		while (number != -1) {
			System.out.print("Enter a positive number to be added to the total or -1 to end: ");
			number = input.nextInt();
			
			if (number != -1) {
			totalNumber = totalNumber + number;
			}
		}
		System.out.printf("The sum of all numbers: %d", totalNumber);
	}

}
