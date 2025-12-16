/**
 * The main program that executes the functions in the class Module and asserts
 * that they return the expected values.
 * 
 * Update the code in Module.java and execute the lab like this:
 *  javac *.java && java Main
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Lab.assertIt(Answer.class.getMethod("hello"), new Object[]{}, "Hello World!"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("isGreater", int.class, int.class), new Object[]{1, 1}, false));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isGreater", int.class, int.class), new Object[]{2, 1}, true));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isGreater", int.class, int.class), new Object[]{1, 2}, false));

        System.out.println(Lab.assertIt(Answer.class.getMethod("compare42", int.class), new Object[]{7}, -1));
        System.out.println(Lab.assertIt(Answer.class.getMethod("compare42", int.class), new Object[]{49}, 1));
        System.out.println(Lab.assertIt(Answer.class.getMethod("compare42", int.class), new Object[]{42}, 0));

        System.out.println(Lab.assertIt(Answer.class.getMethod("compareMixed", int.class, int.class, int.class), new Object[]{1, 1, 1}, 1));
        System.out.println(Lab.assertIt(Answer.class.getMethod("compareMixed", int.class, int.class, int.class), new Object[]{1, 2, 3}, 2));
        System.out.println(Lab.assertIt(Answer.class.getMethod("compareMixed", int.class, int.class, int.class), new Object[]{3, 1, 2}, 3));
        System.out.println(Lab.assertIt(Answer.class.getMethod("compareMixed", int.class, int.class, int.class), new Object[]{1, 2, 1}, 0));

        System.out.println(Lab.assertIt(Answer.class.getMethod("isChildOrSenior", int.class), new Object[]{7}, true));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isChildOrSenior", int.class), new Object[]{65}, true));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isChildOrSenior", int.class), new Object[]{13}, false));

        System.out.println(Lab.assertIt(Answer.class.getMethod("ageToString", int.class), new Object[]{7}, "Youngster"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("ageToString", int.class), new Object[]{13}, "Teenager"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("ageToString", int.class), new Object[]{42}, "Adult"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("ageToString", int.class), new Object[]{65}, "Senior"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("triangleType", int.class, int.class, int.class), new Object[]{1, 1, 1}, "equil"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("triangleType", int.class, int.class, int.class), new Object[]{1, 1, 2}, "isosc"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("triangleType", int.class, int.class, int.class), new Object[]{1, 2, 1}, "isosc"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("triangleType", int.class, int.class, int.class), new Object[]{2, 1, 1}, "isosc"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("triangleType", int.class, int.class, int.class), new Object[]{1, 2, 3}, "different"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("getFruitColor", String.class), new Object[]{"apple"}, "green"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("getFruitColor", String.class), new Object[]{"berry"}, "red"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("getFruitColor", String.class), new Object[]{"citrus"}, "yellow"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("getFruitColor", String.class), new Object[]{"42"}, "unknown"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("looseCompare", int.class, String.class), new Object[]{7, "7"}, true));
        System.out.println(Lab.assertIt(Answer.class.getMethod("looseCompare", int.class, String.class), new Object[]{7, "77"}, false));

        System.out.println(Lab.assertIt(Answer.class.getMethod("intToString", int.class), new Object[]{42}, "42"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("sumToN", int.class), new Object[]{0}, 0));
        System.out.println(Lab.assertIt(Answer.class.getMethod("sumToN", int.class), new Object[]{3}, 3));
        System.out.println(Lab.assertIt(Answer.class.getMethod("sumToN", int.class), new Object[]{5}, 10));

        System.out.println(Lab.assertIt(Answer.class.getMethod("sumOddToN", int.class), new Object[]{0}, 0, 2));
        System.out.println(Lab.assertIt(Answer.class.getMethod("sumOddToN", int.class), new Object[]{3}, 4));
        System.out.println(Lab.assertIt(Answer.class.getMethod("sumOddToN", int.class), new Object[]{6}, 9));

        System.out.println(Lab.assertIt(Answer.class.getMethod("stringOfValues", int.class, int.class), new Object[]{1, 0}, ""));
        System.out.println(Lab.assertIt(Answer.class.getMethod("stringOfValues", int.class, int.class), new Object[]{1, 4}, "1, 2, 3, 4"));

        /*
        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumWhile", int.class), new Object[]{1}, 1, 2));
        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumWhile", int.class), new Object[]{9}, 4));
        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumWhile", int.class), new Object[]{21}, 6));

        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumDoWhile", int.class), new Object[]{1}, 1));
        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumDoWhile", int.class), new Object[]{9}, 4));
        System.out.println(Lab.assertIt(Answer.class.getMethod("countUpToMaxSumDoWhile", int.class), new Object[]{21}, 6));
        */
        
        System.out.println(Lab.assertIt(Answer.class.getMethod("fizzBuzz", int.class, int.class), new Object[]{1, 1}, "1", 2));
        System.out.println(Lab.assertIt(Answer.class.getMethod("fizzBuzz", int.class, int.class), new Object[]{2, 9}, "2 Fizz 4 Buzz Fizz 7 8 Fizz"));
        System.out.println(Lab.assertIt(Answer.class.getMethod("fizzBuzz", int.class, int.class), new Object[]{11, 20}, "11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz"));

        System.out.println(Lab.assertIt(Answer.class.getMethod("isPrime", int.class), new Object[]{1}, false, 2));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isPrime", int.class), new Object[]{47}, true));
        System.out.println(Lab.assertIt(Answer.class.getMethod("isPrime", int.class), new Object[]{99}, false));

        System.out.println(Lab.assertIt(Answer.class.getMethod("fibonacci", int.class), new Object[]{1}, 0, 3));
        System.out.println(Lab.assertIt(Answer.class.getMethod("fibonacci", int.class), new Object[]{7}, 8));
        System.out.println(Lab.assertIt(Answer.class.getMethod("fibonacci", int.class), new Object[]{10}, 34));

        System.out.println(Lab.done());
    }
}
