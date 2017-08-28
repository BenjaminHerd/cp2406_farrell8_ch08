/*
Task:
Stores 10 integers.  Application should call 5 methods that:
1. Display integers
2. Display in reverse order
3. Display the sum of the integers
4. Less than limiting value
5. Higher than average value
 */

public class ArrayMethodDemo {
    public static void main(String[] args) {

        //variable declaration
        int[] numList = {2,4,6,8,10,12,14,16,18,20};
        int limit = 12;
        int x;

        //Method calls for each task
        displayIntegers(numList);

        //Prints on a new line
        System.out.println();

        reverseDisplay(numList);

        System.out.println();

        displaySum(numList);

        System.out.println();

        //Passing multiple parameters into method
        displayLessLimiter(numList, limit);

        System.out.println();

        displayAverageHigher(numList);
    }

    //Function call with initialising parameters
    public static void displayIntegers(int [] numList)
    {
        System.out.print("The numbers are: ");

        //For loop for printing incrementally
        for (int i = 0; i < numList.length; ++i)
        {
            System.out.print(numList[i] + " ");
        }
    }

    public static void reverseDisplay(int[] numList)
    {
        System.out.print("The numbers in reverse are: ");

        //Decrementing for loop for reverse order
        for (int i = numList.length - 1; i >= 0; --i)
        {
            System.out.print(numList[i] + " ");
        }
    }

    public static void displaySum(int[] numList)
    {
        System.out.print("The Numbers added up is: ");
        int total= 0;

        //For loop for checking each variable in the list and adding it to the variable
        for (int i = 0; i < numList.length; ++i)
        {
            total += numList[i];
        }
        System.out.print(total);

    }

    public static void displayLessLimiter(int[] numList, int limit)
    {
        System.out.print("Every number under: " + limit + " - ");

        //Checks each variable in the array and prints each in the list that are less than the limit (12)
        for (int i = 0; i < numList.length; ++i)
        {
            if(numList[i] < limit)
            {
                System.out.print(numList[i] + " ");
            }
        }
    }

    public static void displayAverageHigher(int[] numList)
    {
        //Variables only within the scope of this method only
        int sum = 0;
        double average;

        //Works out average
        for (int i = 0; i < numList.length; ++i)
        {
            sum += numList[i];
        }
        average = sum / numList.length;
        System.out.println("The average is: " + average);

        //Then check each variable in the list that is higher than this calculated average
        for (int i = 0; i < numList.length; ++i)
        {
            if (numList[i] > average)
            {
                System.out.print(numList[i] + " ");

            }
        }
        System.out.println("Are greater than the average.");
    }

}
