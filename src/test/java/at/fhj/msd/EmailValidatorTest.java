package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EmailValidatorTest {
    private EmailValidator validator;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testValidMail() {
        String validMail = "user@example.com";
        assertTrue(validator.isValid(validMail));
    }

    @Test
    public void testInvalidMail() {
        String invalidMail = "userexample.org";
        assertFalse(validator.isValid(invalidMail));
    }
}
