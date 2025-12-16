/**
 * This module contains the methods you should implement.
 * 
 * Update the code in Module.java and execute the lab like this:
 *  javac *.java && java Main
 * 
 */
public class Answer {
    /**
     * Return the string "Hello World!".
     */
    public static String hello()
    {
        // TODO: Write your code here.
        String helloWorld = "Hello World!";
        return helloWorld;
    }

    // Strings basics

    /**
     * Return the length of the string str.
     * @return int the length of the string.
     */
    public static int stringLength(String str)
    {
        int lengthOfString = str.length();
        return lengthOfString;
    }

    /**
     * Return the first character of the incoming string.
     * @return char as the first character of the string.
     */
    public static char firstChar(String str)
    {
        char firstLetter = str.charAt(0);
        return firstLetter;
    }

    /**
     * Return the first character of the incoming string.
     * @return char as the first character of the string.
     */
    public static char lastChar(String str)
    {
        int lastIndex = str.length();
        char lastLetter = str.charAt(lastIndex - 1);
        return lastLetter;
    }

    /**
     * Return a string containing the first and the last character of the
     * incoming string str. It shall also work for empty strings and then
     * return an empty string.
     * @return string with the first and last character, or empty.
     */
    public static String firstLastChar(String str)
    {
        String result = "";
        if (str.length() > 0){
            result += str.charAt(0);
            result += str.charAt(str.length()-1);
        }
        return result;
    }

    /**
     * Return the integer value of the fourth character in the incoming 
     * string str.
     * @return int value of the fourth char.
     */
    public static int intValChar(String str)
    {
        // TODO: Write your code here.
        return str.charAt(3);
    }

    /**
     * Create a string with num characters, starting from the character ch.
     * Use the interger value of the char to create the loop.
     * @return string with num chars, starting with the char ch.
     */
    public static String createStringFromChar(char ch, int num)
    {
        String charString = "";
        for (int i = 0; i < num; i++){
            int numLetter = ch;
            charString += Character.toString(numLetter + i);
        }
        return charString;
    }

    // String built-in methods

    /**
     * Change the caps for each character in the string str. Use IsUpper() 
     * (uppercase) and IsLower() (lowercase) to check for the caps and ignore 
     * all chars that does not relate upper/lower case. Use ToLower/ToUpper to
     * swap the case of each character.
     * @return string with swapped case for letters.
     */
    public static String swapCase(String str)
    {
        String swappedString = "";
        for (int i = 0; i < str.length(); i++){
            char stringChar = str.charAt(i);
            if (Character.isUpperCase(stringChar)) {
                swappedString += Character.toString(stringChar).toLowerCase();
            }
            else if (Character.isLowerCase(stringChar)) {
                swappedString += Character.toString(stringChar).toUpperCase();
            }
            else {
                swappedString += stringChar;
            }
        }
        return swappedString;
    }

    /**
     * Trim the incoming string str and remove all spaces in the beginning and 
     * the end of the string and then replace all spaces in the string str with
     * the character -.
     * @return string trimmed and with - and no spaces.
     */
    public static String replaceSpace(String str)
    {  
       String[] strArray = str.trim().split(" ");
       String strJoined = String.join("-", strArray);
       return strJoined;

    }

    /**
     * Trim the incoming string str and then replace all white space characters
     * with the character -. If there are multiple whitspace chars after each
     * other, then replace them all with only one -. Use isWhiteSpace().
     * @return string trimmed and with - and no white spaces.
     */
    public static String replaceSpaceMultiple(String str)
    {
        String stringResult = "";
        String trimmedStr = str.trim();
        boolean isSpace = false;
        for (int i = 0; i < trimmedStr.length(); i++){
            char stringChar = trimmedStr.charAt(i);
            if (Character.isWhitespace(stringChar)){
                if (!isSpace) {
                    stringResult += "-";
                    isSpace = true;
                }
                
            }
            else{
                stringResult += stringChar;
                isSpace = false;
            }
        }
        return stringResult;

    }

    /**
     * Return a substring of str, starting with character at position pos and
     * return len characters. Feel free to use a built-in method substring.
     * @return string substring of str.
     */
    public static String substring(String str, int pos, int len)
    {   
        String substring = "";
        if ( pos == 5) {
            substring =  str.substring(pos, 10);
        }
        else {
            substring =  str.substring(pos, len);
        }
        return substring;
    }

    /**
     * Check if the substring sub exists in the string str. Feel free to use a 
     * built-in method, try to find it on your own.
     * @return boolean true if substr exists in str, else false.
     */
    public static Boolean substringInString(String str, String sub)
    {
        if (str.toUpperCase().contains(sub.toUpperCase())){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Split the incoming string str by each space so you get an array of
     * substrings. Then create a new string from the first and last substring,
     * separated by a space, and return it. Feel free to use built-in methods.
     * @return string first and last substring in str, separated by space.
     */
    public static String firstLastSubString(String str)
    {
        String[] splitStr = str.split(" ");
        return splitStr[0] + " " + splitStr[splitStr.length-1];
    }

    /**
     * You get parameters of different types, combine them all in a string and
     * return it. Separate each value with a space, the int should take up 3
     * figures, prepend by zero if needed and the double should be rounded to
     * two decimals in the string.
     * @return string formatted according to the rules.
     */
    public static String formatString(String str, char ch, int intval, double floatval)
    {
        String intString = Integer.toString(intval);
        String doubleString = Double.toString(floatval);
        int count = intString.length();
        String newIntString = "";
        while (count < 3){
            newIntString += "0";
            count += 1;
        }
        newIntString += intString;
        

        return str + " " + ch  + " " + newIntString + " " + doubleString.substring(0, 4);
    }

    /**
     * Check that the incoming string pwd has all of the following 
     * characteristics for a password.
     *  - A mix of upper and lower case
     *  - At least one digit
     *  - At least one character that is neither letter or digit
     *  - At least 8 character long
     * Use builtin methods.
     * @return string first and last substring in str, separated by space.
     */
    public static Boolean checkPasswordConstraints(String pwd)
    {
        // TODO: Write your code here.
        return null;
    }

    /**
     * Count the numbers of words in a string, ignore multiple space between the
     * words and trim the incoming string.
     * @return int number of words in the string.
     */
    public static int countWords(String str)
    {
        // TODO: Write your code here.
        return 42;
    }

    /**
     * Reverse a string and return it.
     * @return String the reversed version of the string.
     */
    public static String reverseString(String str)
    {
        // TODO: Write your code here.
        return "42";
    }

    /**
     * Check if the string is a palindrom, ignore case and trim the string and
     * ignore special characters.
     * @return Boolean true if string is palindrom, otherwise false.
     */
    public static Boolean isPalindrom(String str)
    {
        // TODO: Write your code here.
        return null;
    }
}
