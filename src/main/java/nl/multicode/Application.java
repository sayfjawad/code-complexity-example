package nl.multicode;

import nl.multicode.action.CombineCommand;
import nl.multicode.action.CombineToUppercaseCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static nl.multicode.validate.ArgumentsValidator.isArguementsValid;
import static nl.multicode.validate.ArgumentsValidator.isValidCombineCommand;
import static nl.multicode.validate.ArgumentsValidator.isValidCombineToUppercase;

public class Application {

    private static final Logger log = LogManager.getLogger(Application.class);

    public String execute(String command, String firstArgument, String secondArgument) {
        String result = null;
        if (isValidCombineCommand(command) && isArguementsValid(firstArgument, secondArgument)) {
            log.info("Combined firstArgument '{}' and secondArgument '{}' and resulted in '{}'", firstArgument, secondArgument, firstArgument + secondArgument);
            result = new CombineCommand().executeCommand(firstArgument, secondArgument);

        } else if (isValidCombineToUppercase(command) && isArguementsValid(firstArgument, secondArgument)) {
            result = new CombineToUppercaseCommand().executeCommand(firstArgument, secondArgument);
            log.info("Combined to uppercase firstArgument '{}' and secondArgument '{}' resulted in '{}'", firstArgument, secondArgument, result);
        }
        return result;
    }
}