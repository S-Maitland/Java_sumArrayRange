import java.util.*;

public class Main {

    public static int[] data = {1,2,3,4,5};
    public static int startingNumber = 0;
    public static int finishingNumber = 3;


    public static int sumArrayRange(int[] dataArray, int start, int end)
    {
        int sum = 0;
        for(int index = start; index <= end; index++){
            sum+= dataArray[index];
        }

        return sum;
    }


    public static void main(String[] args){
        System.out.println(sumArrayRange(data,startingNumber, finishingNumber));
    }
}
