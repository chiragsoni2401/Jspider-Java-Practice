
public class Triangle {
/*write a program to generate the pattern at right hand side of = basically this pattern is combination of 2 patterns on left hand side
    *    *             *
   **    **           ***
  *** +  ***  =      *****
 ****    ****       *******
*****    *****     *********
*/
	public static void main(String[] args) 
	{
		System.out.println("Program started");
		for(int k=1;k<=5;k++)//this loop is deciding how many rows will print
		{
          for(int i=5;i>=1;i--)//this loop is deciding how many columns will print, body of the inner loop will run 5x5 times if k<=N and i<=M then it will run NXM times
			{
				if(i>k)
			  System.out.print(" ");
				else
			  System.out.print("*");

			}
			for(int j=1;j<=k;j++)
			{
			  if( j!=1)
              System.out.print("*");

			}
			  System.out.println();
	    }
    }

}
