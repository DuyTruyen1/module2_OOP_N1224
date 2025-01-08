package ss10_exception.validation;

import ss10_exception.exception.EmptyFieldException;
import ss10_exception.exception.MinLengthException;
import ss10_exception.exception.NegativeNumberException;
import ss10_exception.exception.NumberOutOfRangeException;

public class CommonValidation {
    public static void validateIsEmpty(String value , String fieldName) throws EmptyFieldException{
        if(value == null || value.isEmpty()){
            throw new EmptyFieldException(fieldName + " not empty");
        }
    }

    public static int parseInt(String value, String fieldName) {
        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            throw new NumberFormatException(fieldName + " is not a number");
        }
    }

    public static double parseDouble(String value, String fieldName) {
        try {
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            throw new NumberFormatException(fieldName + " is not a number");
        }
    }

    public static void validateNumberOutOfRange(double value, String fieldName, double min, double max)
        throws NumberOutOfRangeException{
            if(value < min || value > max){
                throw new NumberOutOfRangeException(String.format("%s out of range [%s, %s].", fieldName,min,max));
            }
        }

    public static void validateMinLength(String value, String fieldName ,int min) throws MinLengthException {
        if(value.length() < min){
            throw new MinLengthException(String.format("%s must have at least %s character.", fieldName,min));
        }
    }

    public static void validateIsNegative(double value, String fieldName) throws NegativeNumberException {
        if(value < 0){
            throw new NegativeNumberException(fieldName + " is not a negative number");
        }
    }
}
