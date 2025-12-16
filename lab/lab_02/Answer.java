/**
 * This module contains the methods you should implement.
 * 
 * Update the code in Module.java and execute the lab like this:
 *  javac *.java && java Main
 * 
 * HINTS THAT COULD BE USED IN THE LAB:
 * 
 * if, else if, else
 * switch
 * Object.valueOf()
 * Object.toString()
 * for
 * while
 * do while
 */
public class Answer {
    /**
     * Return the string "Hello World!".
     * @return String with hello message 
     */
    public static String hello()
    {
        // TODO: Write your code here.
        String message = "Hello World!";
        return message;
    }

    // IF

    /**
     * Check if number1 is greater than number2 and then return true, otherwise
     * return false.
     * @return boolean true or false 
     */
    public static Boolean isGreater(int number1, int number2)
    {
        // TODO: Write your code here.
        if (number1 > number2){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Checks the incoming value and returns value 1 if it is higher than 42
     * or -1 if it is lower than 42 or 0 when the incoming number is equal to
     * 42.
     * @return int -1, 0 or 1
     */
    public static int compare42(int number)
    {
        int result = 0;
        if (number == 42){
            result = 0;
        }
        else if (number > 42){
            result = 1;
        }
        else if (number < 42){
            result = -1;
        }
        return result;
    }

    /**
     * Compare if all numbers are equal and then return 1. If number3 is
     * greater than number2 and number2 is greater than number1, then return 2.
     * If number1 is the greatest number, then return 3. Otherwise return 0.
     * @return int 0, 1, 2, 3
     */
    public static int compareMixed(int number1, int number2, int number3)
    {
        int result = 0;
        if (number1 == number2 && number1 == number3){
            result = 1;
        }
        else if (number3 > number2 && number2 > number1){
            result = 2;
        }
        else if (number1 > number2 && number1 > number3){
            result = 3;
        }
        else {
            result = 0;
        }
        return result;
    }

    /**
     * Check if age is below 13 or age is above/equal to 65 and then return true.
     * Return false if the age is neither a child or a senior.
     * @return boolean true or false
     */
    public static Boolean isChildOrSenior(int age)
    {
        if (age < 13){
            return true;
        }
        else if (age >= 65){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Based on the age, return a string like this:
     *  age < 13 return "Youngster"
     *  age < 20 return "Teenager"
     *  age < 65 return "Adult"
     *  age >= 65 return "Senior"
     * @return 
     */
    public static String ageToString(int age)
    {
        String result = "";
        if (age < 13){
            result = "Youngster";
        }
        else if (age < 20){
            result = "Teenager";
        }
        else if (age < 65){
            result = "Adult";
        }
        else if (age >= 65){
            result = "Senior";
        }
        return result;
    }

    /**
     * Get the length of the sides of the triangle and check if the triangle is:
     * Equilateral: All sides are the same length.
     * Isosceles: Two sides are the same length.
     * Different sided: All sides are different lengths.
     * @return String as "equil", "isosc" or "different".
     */
    public static String triangleType(int sideA, int sideB, int sideC)
    {
        String result = "";
        if (sideA == sideB && sideA == sideC){
            result = "equil";
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC){
            result = "isosc";

        }
        else {
            result = "different";
        }

        return result;
    }   

    // SWITCH

    /**
     * Use a switch statement to return the color of a fruit where "apple=green",
     * "citrus=yellow", "berry=red" and the default color should be "unknown". 
     * @return String as the color of the fruit.
     */
    public static String getFruitColor(String fruit)
    {
        String color = "unknown";
        switch(fruit){
            case "citrus":
                color = "yellow";
                break;
            case "berry":
                color = "red";
                break;
            case "apple":
                color = "green";
                break;
        }
        return color;
    }

    // Object.valueOf(), Object.toString()

    /**
     * Compare the two values intValue and strValue and check if they are equal
     * values. Do the check by converting the strValue to an integer value.
     * @return boolean true or false
     */
    public static Boolean looseCompare(int intValue, String strValue)
    {
        int stringToIntValue = Integer.parseInt(strValue);
        if (intValue == stringToIntValue){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Convert the incoming intValue to a string and return it.
     * @return String with the intValue
     */
    public static String intToString(int intValue)
    {
        String intToStringValue = Integer.toString(intValue);
        return intToStringValue;
    }

    // Loop

    /**
     * Sum all values from 1 up to and not including the parameter n.
     * @return int with the sum
     */
    public static int sumToN(int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * Return the sum of all odd numbers from 1 up to and including the 
     * value of parameter n.
     * @return int with the sum of the odd numbers
     */
    public static int sumOddToN(int n)
    {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Return a string containing all values from value1 up to and including 
     * value2 and separate the values with a ', '. If value2 is equal or less
     * than value1, then return an empty string "".
     */
    public static String stringOfValues(int value1, int value2)
    {
        String result = "";
        if (value2 <= value1){
            result = "";
        }
        else {
            for (int i = value1; i <= value2; i++){
                result += i;
                if (i < value2){
                    result += ", ";
                }
            }
        }
        return result;
    }

    // Advanced

    /**
     * Loop from start to end and return a string with the following conditions:
     * "Fizz" if the number is divisible by 3.
     * "Buzz" if the number is divisible by 5.
     * "FizzBuzz" if the number is divisible by both 3 and 5.
     * Otherwise, the number itself must be added to the string.
     * Add a space between each value.
     * @return String with correct mix of fizz and buzz
     */
    public static String fizzBuzz(int start, int end)
    {
        String fizzBuzz = "";
        for (int i = start; i <= end; i++){
            if (i > start) {
                fizzBuzz += " ";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz += "FizzBuzz";
            }
            else if (i % 5 == 0) {
                fizzBuzz += "Buzz";
            }
            else if (i % 3 == 0) {
                fizzBuzz += "Fizz";
            }
            else {
                fizzBuzz += Integer.toString(i);
            }
        }
        return fizzBuzz;
    }

    /**
     * Check if the incoming number is a prime number, meaning it is only
     * even divisible with 1 and itself. 
     * @return true or false.
     */
    public static Boolean isPrime(int number)
    {
        // TODO: Write your code here.
        return null;
    }

    /**
     * The Fibonacci sequence starts with 0 and 1, and each subsequent number is
     * the sum of the previous two (0, 1, 1, 2, 3, 5, 8, ...). Write the method
     * so it returns the n:th number in the Fibonacci sequence. When n=4 it 
     * should return 2 and when n=6 it should return 5.
     * @return The n:th number in the Fibonacci sequence.
     */
    public static int fibonacci(int n)
    {
        // TODO: Write your code here.
        return 42;
    }
}
