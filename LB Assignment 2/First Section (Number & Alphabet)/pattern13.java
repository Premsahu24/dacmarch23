//Pattern 13
class pattern13 {
   public static void main(String args []){
	   char ch = 'A';
	   
    for (int i=1; i<=5; i++)
	{
	   for (int j=i; j<=5; j++)
	   {
	    System.out.print(" ");
	   } 
	   for (int j=1; j<=i; j++)
	   {
	    System.out.print(ch +" ");
	   } 
	  
       System.out.println();
	    ch++;
	} 
}
}