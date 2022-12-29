import java.util.ArrayList;

public class IT232_Cirelli_Unit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//************************************************************
        //******Assignment 3 Section 1
        //************************************************************
		 System.out.printf("\n"); 
	     System.out.printf("**********Assignment 3 Section 1 **********\n");
	     System.out.printf("\n");
	     System.out.printf("Section 1: Two-dimensional Array.\n");
	     System.out.printf("\n");

        String[][] salesRegions = new String[4][4];
        salesRegions[0][0] = "North";
        salesRegions[1][0] = "South";
        salesRegions[2][0] = "East";
        salesRegions[3][0] = "West";

        salesRegions[0][1] = "Bob";
        salesRegions[0][2] = "Stef";
        salesRegions[0][3] = "Ron";

        salesRegions[1][1] = "Sue";
        salesRegions[1][2] = "Janice";
        salesRegions[1][3] = "Will";

        salesRegions[2][1] = "Nathan";
        salesRegions[2][2] = "Henry";
        salesRegions[2][3] = "Kimmy";

        salesRegions[3][1] = "Wanda";
        salesRegions[3][2] = "Charles";
        salesRegions[3][3] = "Pete";
        
        for (int row = 0; row<4; row++)
        {
        	for (int col = 0; col < 4; col++)
        	{
        		if (col != 0)
        		{
        			System.out.print("\n");
        		}
        		System.out.print(salesRegions[row][col]);
        	}
        	System.out.print("\n\n");
        }
        
        
      //************************************************************
      //******Assignment 3 Section 2
      //************************************************************
        System.out.printf("\n"); 
	    System.out.printf("**********Assignment 3 Section 2 **********\n");
	    System.out.printf("\n");
	    
	    System.out.printf("Section 2: Array List.\n\n");
	  
	    ArrayList<String> salesTeam = new ArrayList<String>();
	   
	    for (int col = 1; col<4; col++)
	    {
	    	salesTeam.add(salesRegions[0][col]);
	    }
	    
	    System.out.printf("There are " + salesTeam.size() + " names in the salesTeam arraylist.\n");
	    
	    for (int col = 1; col<4; col++)
	    {
	    	salesTeam.add(salesRegions[1][col]);
	    }
	    System.out.printf("\n");
	 
	    if (salesTeam.contains("Stef"))
	    {
	    	System.out.printf("Stef is in the salesTeam arraylist.\n\n");
	    }
	    else
	    {
	    	 System.out.printf("Stef is not in the salesTeam arraylist\n\n");
	    }
	    
	    System.out.printf("There are " + salesTeam.size() + " names in the salesTeam arraylist.\n\n");
	   
	    salesTeam.remove("Janice");
	    salesTeam.remove("Ron");
	    
	    System.out.printf("There are " + salesTeam.size() + " names in the salesTeam arraylist.\n\n");
	    
	    System.out.printf("Names currently in the salesTeam arraylist.\n\n");
	    
	    
	  
		System.out.println(String.join("\n", salesTeam));
	    System.out.printf("\n");
	}
}
