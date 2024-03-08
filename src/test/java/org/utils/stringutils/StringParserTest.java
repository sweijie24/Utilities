package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {

    // 3 part format
    // methodBeingTested_conditionToTest_expectedOutput
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {

        // Setup lines
        StringParser sp = new StringParser();
        String inputString = "Hello|world";
        String separator = "\\|"; // "\\" escapes the meaning of |
        ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // Actual Test
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullString_expectException() {

        // Setup lines
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|"; // "\\" escapes the meaning of |
        //ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // Actual Test
        // assertEquals(2, stringParts.size());
        assertThrows(InvalidStringInputException.class,
                ()-> sp.splitString(inputString, separator));
    }
}
