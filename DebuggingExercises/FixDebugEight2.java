// Sum and average an array of integers
public class FixDebugEight2
{
   public static void main(String args[])
   {

       //integer array list
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0;
      int x;

      //for loop that adds total from list
      for(x = 0; x < someNums.length; ++x)
        tot += someNums[x];

      //Prints out sum and average
      System.out.println("Sum is: " +  tot);
      System.out.println("Average is: " + tot / someNums.length);
   }
}
