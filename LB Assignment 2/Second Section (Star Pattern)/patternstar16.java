//Pattern star 16
class patternstar16 {
   public static void main(String args []){
	   
	 
    for (int i=0; i<=5; i++)
	{
	  for (int j=5; j>i; j--)
	  {
	  System.out.print(" ");
	  }
	  
	  for (int j=1; j<=i; j++)
	    { 
		  if ((i==3 && j==2) ||(i==4 && j==2) ||(i==4 && j==3))
		  {
		  System.out.print(" ");
		  }
	      else 
		  {
		  System.out.print("*");
	      }
		}  
         System.out.println();
	}	
}
}