//pyramid orange3 Inverted full pyramid
class pyramidorange5 {

public static void main(String args []){
	   

    for (int i=1; i<=6; i++)
	{
	  for (int j=0; j<=i; j++)
	    {
	    System.out.print(" ");
		}
	  for (int k=6; k>=i; k--)
	   { 
	   System.out.print("* ");
	   }
        System.out.println();
	}
}
}