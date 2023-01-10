package nl.multicode.validate;

public class ArgumentsValidator {
    public static boolean isArguementsValid(String firstArgument, String secondArgument) {
        return firstArgument != null && secondArgument != null;
    }

    public static boolean isValidCombineToUppercase(String command) {
        return command != null && command.equals("combineToUppercase");
    }

    public static boolean isValidCombineCommand(String command) {
        return command != null && command.equals("combine");
    }
}
