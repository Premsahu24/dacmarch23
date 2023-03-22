//Pattern 10
class pattern10 {
   public static void main(String args []){
	   
	  int alpha =64;
    for (int i=5; i>=1; i--)
	{
	    for (int j=1; j<i; j++)
	    {
	    System.out.print(" ");
		}
		for (int j=i; j<=5; j++)
	    {
	    System.out.print((char)(alpha + j) + " ");
		}
		
    System.out.println();
	}   
}
}