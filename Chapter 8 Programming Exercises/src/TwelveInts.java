/*
Write an application that stores 12 integers in an array
1st to last then last to 1st
 */

public class TwelveInts {
    public static void main(String[] args) {

        //variable declaration
        int[] numList = {1,2,3,4,5,6,7,8,9,10,11,12};
        int x;

        //For loop initialisation

        //incrementing for normal order
        for(x = 0; x < numList.length; ++x)
        {
            System.out.print(numList[x] + " ");

        }
        System.out.println();

        //decrementing for reverse order
        for(x = numList.length - 1; x >= 0; --x){
            System.out.print("" + numList[x] + " ");
        }

        System.out.println();

    }
}
