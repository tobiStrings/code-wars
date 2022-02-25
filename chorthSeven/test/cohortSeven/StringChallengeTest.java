package cohortSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringChallengeTest {

    @Test
    void testStringChallenge(){
        String expected = "catsAndDogsAreAwesome";
        String result = StringChallenge.covertToCamelCase("cats AND*Dogs-are Awesome");
        assertEquals(expected,result);
    }

    @Test
    void testStringChallengeTwo(){
        String expected = "aBCDEFG";
        String result = StringChallenge.covertToCamelCase("a b c d-e-f%g");
        assertEquals(expected,result);
    }
}