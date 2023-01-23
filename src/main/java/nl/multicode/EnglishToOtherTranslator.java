package nl.multicode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnglishToOtherTranslator {

    private static final Logger log = LogManager.getLogger(EnglishToOtherTranslator.class);
    public static final String DUTCH = "dutch";
    public static final String SWEDISH = "swedish";

    public String getTranslationFor(String theWord, String toLanguage) {

        if (theWord == null || toLanguage == null) {
            return "null word or language arguments are not allowed!";
        }
        log.info("requesting translation of {} to {}", theWord, toLanguage);


        switch (theWord) {
            case "hello":
                if (DUTCH.equals(toLanguage)) {
                    return "hallo";
                } else if (SWEDISH.equals(toLanguage)) {
                    return "hallå";
                }
                return unknowTranslationMessage(theWord);
            case "bye":
                if (DUTCH.equals(toLanguage)) {
                    return "doei";
                } else if (SWEDISH.equals(toLanguage)) {
                    return "hejdå";
                }
                return unknowTranslationMessage(theWord);
            case "hi":
                if (DUTCH.equals(toLanguage)) {
                    return "hi";
                } else if (SWEDISH.equals(toLanguage)) {
                    return "hej";
                }
                return unknowTranslationMessage(theWord);
            case "welcome":
                if (DUTCH.equals(toLanguage)) {
                    return "welkom";
                } else if (SWEDISH.equals(toLanguage)) {
                    return "välkommen";
                }
                return unknowTranslationMessage(theWord);
            default:
                return unknowTranslationMessage(theWord);
        }
    }

    private static String unknowTranslationMessage(String theWord) {

        return "unknown translation for word '" + theWord + "'";
    }
}