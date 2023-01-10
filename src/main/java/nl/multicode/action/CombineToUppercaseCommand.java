package nl.multicode.action;

public class CombineToUppercaseCommand {

    public String executeCommand(String firstArgument, String secondArgument) {
        return firstArgument.toUpperCase() + "_" + secondArgument.toUpperCase();
    }
}