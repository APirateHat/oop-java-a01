/**
 * This module contains the methods you should implement.
 * 
 * Update the code in Module.java and execute the lab like this:
 *  javac *.java && java Main
 * 
 */
import java.util.Arrays;

public class Answer {
    /**
     * Return the string "Hello World!".
     * @return String the string with the message.
     */
    public static String hello()
    {
        String helloWorld = "Hello World!";
        return helloWorld;
    }

    // Number basics

    /**
     * Return the square root of 2, rounded to 4 decimals. Use built in methods.
     * @return double the square root of two.
     */
    public static double squareOfTwo()
    {
        double squareRoot = Math.sqrt(2);
        double roundedSquareRoot = Math.round(squareRoot * 10000.0) / 10000.0;
        return roundedSquareRoot;
    }

    /**
     * Return the sum of a and b, rounded to two decimals.
     * @return double sum of the two numbers, rounded 2 decimals.
     */
    public static double addition(double a, double b)
    {
        double sum = a + b;

        return Math.round(sum * 100.0) / 100.0;
    }

    /**
     * Return the integer value of the incoming string str.
     * @return int value of string.
     */
    public static int intValString(String str)
    {
        int value = Integer.parseInt(str);
        return value;
    }

    /**
     * Use string formatting to create a string with Math.PI and present it with
     * 5 decimals.
     * @return String with the value of pi with 5 decimals.
     */
    public static String formatPiAsString()
    {
        double pi = Math.round(Math.PI * 100000.0) / 100000.0;
        String stringPi = String.valueOf(pi);
        return stringPi;
    }

    /**
     * Round the incoming value val to it closest higher integer.
     * @return int as the rounded value.
     */
    public static int roundUp(double val)
    {
        // @TODO: Write your code here.
        double roundedDouble = Math.ceil(val);
        int doubleToInt = (int) roundedDouble;
        return doubleToInt;
    }

    /**
     * Round the incoming value val to it closest lower integer.
     * @return int as the rounded value.
     */
    public static int roundDown(double val)
    {
        double roundedDouble = Math.floor(val);
        int doubleToInt = (int) roundedDouble;
        return doubleToInt;
    }

    // Numbers in an array

    /**
     * Return the length of the incoming array arr.
     * @return int length of array.
     */
    public static int lengthOfArray(int[] arr)
    {
        // @TODO: Write your code here.
        return arr.length;
    }

    /**
     * Return the first item in the array.
     * @return int first item in the array.
     */
    public static int firstItemInArray(int[] arr)
    {
        // @TODO: Write your code here.
        return arr[0];
    }

    /**
     * Return the last item in the array.
     * @return int first item in the array.
     */
    public static int lastItemInArray(int[] arr)
    {
        // @TODO: Write your code here.
        return arr[arr.length-1];
    }

    /**
     * Return the middle item in the array, if the middle has two values, then
     * return the average of the two values and round the result.
     * @return int mid item or average of mid items.
     */
    public static int midItemInArray(int[] arr)
    {   
        int result = 0;
        int middleOfArray = arr.length / 2;
        if (arr.length % 2 == 0){
            double average = (arr[middleOfArray] + arr[middleOfArray-1]) / 2.0;
            int newresult = (int) Math.floor(average);
            result = newresult;

        }
        else{
            result = arr[middleOfArray];
        }
        return result;
    }

    /**
     * Sum all items in the array.
     * @return int sum of the items in the array.
     */
    public static int sumArray(int[] arr)
    {
        int sum = 0;
        for(int item: arr){
            sum += item;
        }
        return sum;
    }
    /**
     * Find the largest value in the array.
     * @return int the largest value in the array.
     */
    public static int max(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    /**
     * Check if the array is sorted in ascending order.
     * @return boolean true if sorted array else false.
     */
    public static Boolean isSorted(int[] arr)
    {
        boolean value = false;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1] - 1){
                value = true;
            }
            else{
                value = false;
            }
        }
        return value;
    }

    /**
     * Count the average of the items in the array, round up to the nearest
     * integer.
     * @return int average of the array items, rounded up.
     */
    public static int average(int[] arr)
    {
        int sum = 0;
        for(int value:arr){
            sum += value;
        }
        double sumDouble = (double)sum / arr.length;
        double result = Math.ceil(sumDouble);
        int round = (int)result;
        
        return round;
    }


    /**
     * Clone the incoming array and reverse the items in the clone (change its
     * order and reverse all items in it).
     * @return int[] cloned array with reversed content.
     */
    public static int[] reverse(int[] arr)
    {   
        for(int i = 0; i < arr.length / 2; i++){
            int v = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = v;
        }
        return arr;
    }

    /**
     * Clone the incoming array into a new array and the sort it, return the 
     * cloned and sorted array.
     * @return int[] cloned array with sorted content.
     */
    public static int[] sort(int[] arr)
    {
        int[] clonedArr = arr.clone();
        Arrays.sort(clonedArr);
        return clonedArr;
    }

    /**
     * Find the median value in the array arr, but do not modify the incoming
     * array.
     * @return int mean value in the array.
     */
    public static int median(int[] arr)
    {
        int result = 0;
        int middleOfArray = arr.length / 2;
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        if (arr.length % 2 == 1){
            
            result = sortedArr[middleOfArray];

        }
        else{

            int sum = (sortedArr[middleOfArray] + sortedArr[middleOfArray - 1]);
            result = sum / 2;
        }
        return result;
    }
}
