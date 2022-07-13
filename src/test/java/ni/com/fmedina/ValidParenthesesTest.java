package ni.com.fmedina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void whenStringIsValid_thenReturnTrue() {
        String s = "()[]{}";
        boolean actual = validParentheses.isValid(s);
        assertEquals(true, actual);
    }

    @Test
    public void whenStringIsNotValid_thenReturnFalse() {
        String s = "(}";
        boolean actual = validParentheses.isValid(s);
        assertEquals(false, actual);
    }
}