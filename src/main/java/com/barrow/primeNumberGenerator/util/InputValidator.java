package com.barrow.primeNumberGenerator.util;

public class InputValidator {
    private static final String ILLEGAL_INPUT_MESSAGE = "Unacceptable input, please provide a start and end value for the range to generate primes from.";
    private static final String ILLEGAL_NUMBER_MESSAGE = "Input: '%s' is not an acceptable integer.";

    public static boolean validateInput(String... args) {
        if(args == null || args.length != 2 || !validateNumber(args[0]) || !validateNumber(args[1])) {
            System.err.println(ILLEGAL_INPUT_MESSAGE);
            return false;
        }
        return true;
    }

    private static boolean validateNumber(String arg) {
        try {
            Integer.parseInt(arg);
        }
        catch(NumberFormatException ex) {
            System.err.println(String.format(ILLEGAL_NUMBER_MESSAGE, arg));
            return false;
        }
        return true;
    }
}
