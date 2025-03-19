package string.string_methods;

public class CompareToCase {
    public static void main(String args[])
    {

        String s1 = "mumbai";
        String s2 = "mumbai";
        String s3 = "ranchi";
        String s4 = "pune";
        String s5 = ""; // Empty string.
        String s6 = new String("mumbai");


// This statement will print 0 because both are equal.
        System.out.println(s1.compareTo(s6));

// This statement will print 0 because both are equal.
        System.out.println(s1.compareTo(s2));

// This statement will print -5 because 'm' is 5 times lower than 'm'.
        System.out.println(s1.compareTo(s3));

// This statement will print -3 because 'm' is 3 times lower than 'p'.
        System.out.println(s1.compareTo(s4));

// This statement will print 2 because 'r' is 2 times greater than 'p'.
        System.out.println(s3.compareTo(s4));

// This statement will print 4 because there are 4 characters in pune, whereas empty string has no characters.
        System.out.println(s4.compareTo(s5));

    }
}

