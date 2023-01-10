package nl.multicode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static nl.multicode.validation.ArgumentsValidator.isFirstAndSecondArgumentsValid;
import static nl.multicode.validation.ArgumentsValidator.isValidCombineCommand;
import static nl.multicode.validation.ArgumentsValidator.isValidCombineToUppercaseCommand;

public class Application {

    private static final Logger log = LogManager.getLogger(Application.class);

    public String execute(String command, String firstArgument, String secondArgument) {
        String result = null;

        if (isValidCombineCommand(command) && isFirstAndSecondArgumentsValid(firstArgument, secondArgument)) {
            log.info("Combined firstArgument '{}' and secondArgument '{}' and resulted in '{}'", firstArgument, secondArgument, firstArgument + secondArgument);
            result = firstArgument + secondArgument;

        } else if (isValidCombineToUppercaseCommand(command) && isFirstAndSecondArgumentsValid(firstArgument, secondArgument)) {
            final var combinedToUppercase = firstArgument.toUpperCase() + "_" + secondArgument.toUpperCase();
            log.info("Combined to uppercase firstArgument '{}' and secondArgument '{}' resulted in '{}'", firstArgument, secondArgument, combinedToUppercase);
            result = combinedToUppercase;
        }
        return result;
    }
}