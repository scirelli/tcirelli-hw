import java.util.Scanner;   
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class IT391_Cirelli_unit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //*********************************************************
        //****Assignment 2, Part A, Section 1
        //*********************************************************
        System.out.printf("\n"); 
        System.out.printf("**********Part A: Section 1 **********\n");
        System.out.printf("\n");
        System.out.printf("Enter any word and hit enter to see the word reversed: ");
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf("\nYour word in reverse is: " + revString(str) + "\n");
        
        

        //*********************************************************
        //****Assignment 2, Part A, Section 2
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Part A: Section 2 **********\n");
        System.out.printf("\n");
        
        //Create the queue object from LinkedList class for more flexibility
        Queue<String>  shoppers = new LinkedList<String>();

        //Load the queue with names
        shoppers.add("Jane");
        shoppers.add("Bob");
        shoppers.add("Liza");
        shoppers.add("Tom");
        shoppers.add("Mary");

        System.out.printf("The number of shoppers at the grocery store is, " +  shoppers.size() + "\n");
        System.out.printf("The first shopper in line is, " +  shoppers.peek() + "\n");
        
        shoppers.add("Stephen");
        shoppers.add("Ellen");

        //shoppers.remove();
        //shoppers.remove();
        //shoppers.remove();
        for (int i =1; i< 4; i++)
        {
        	shoppers.remove();
        }
        
        System.out.printf("The number of shoppers now in line is, " +  shoppers.size() + "\n");
        System.out.printf("The shopper currently first in line is, " +  shoppers.peek() + "\n");
        
       

        //*********************************************************
        //****Assignment 2, Part B, Section 1
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Part B: Section 2 **********\n");
        System.out.printf("\n");
        
        Queue<String>  customers = new LinkedList<String>();
        
        customers.add("Jim");
        customers.add("Bob");
        customers.add("Susan");
        customers.add("Liz");
        customers.add("Alex");
        
        System.out.printf("The number of people in line at the bank is, " + customers.size() + "\n");
        System.out.printf("The names of those in line at the bank are \n" );
        for (String customer : customers)
        {
        	System.out.println(customer);
        }
      
        System.out.printf("The first customer in line is, " + customers.peek() + "\n");
                    
        customers.add("Andy");
        customers.add("Rhonda");
        
        //customers.remove();
        //customers.remove();
        //customers.remove();
        for (int i =1; i< 4; i++)
        {
        	customers.remove();
        }
        
        System.out.printf("The number of customers in line now is, " + customers.size() + "\n");
        
        
        //*********************************************************
        //****Assignment 2, Part B, Section 2
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Part B: Section 2 **********\n");
        System.out.printf("\n");
        System.out.printf("Please enter a sentence: ");
        
        Scanner scanner2 = new Scanner(System.in);
        String str2 = scanner2.nextLine();
        System.out.printf("\nYour sentence in reverse is: " + reverseSentence(str2.split("\\s+")) + "\n");
        
    }


	 private static String revString(String str)
	    {
	        Stack<String> wordStack = new Stack<String>();

	        for (int i = 0; i < str.length(); i++)
	            wordStack.push(str.substring(i, i+1));
	        String reversed = "";
	        for (int i = 0; i < str.length(); i++)
	            reversed += wordStack.pop();
	        return reversed;

		}
    
	 private static String reverseSentence(String[] str)
	    {
		 	Stack<String> Stack = new Stack<String>();
		 	//System.out.println(Arrays.toString(str));
		 	for(int i=0; i<str.length; i++) {
		 		Stack.push(str[i]);
		 	}
		 	for(int i=0; i<str.length; i++) {
		 		str[i] = Stack.pop();
		 	}
		 	return String.join(" ", str);

		}
   
}
