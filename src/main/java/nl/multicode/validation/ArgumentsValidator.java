package nl.multicode.validation;

public class ArgumentsValidator {

    public static boolean isFirstAndSecondArgumentsValid(String firstArgument, String secondArgument) {
        return firstArgument != null && secondArgument != null;
    }

    public static boolean isValidCombineToUppercaseCommand(String command) {
        return command != null && command.equals("combineToUppercase");
    }

    public static boolean isValidCombineCommand(String command) {
        return command != null && command.equals("combine");
    }
}
