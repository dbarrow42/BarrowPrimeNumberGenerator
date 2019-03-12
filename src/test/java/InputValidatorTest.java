import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputValidatorTest {

    @Test
    void ValidateValidInputReturnsTrue() {
        String[] args = {"0", "5"};
        assertTrue(InputValidator.validateInput(args));
    }

    @Test
    void ValidateInputWithLessThanTwoArgsReturnsFalse() {
        String[] args = {};
        assertFalse(InputValidator.validateInput(args));
    }

    @Test
    void ValidateInputWithMoreThanTwoArgsReturnsFalse() {
        String[] args = {"0", "5", "10"};
        assertFalse(InputValidator.validateInput(args));
    }

    @Test
    void ValidateInputWithNonIntegerArgReturnsFalse() {
        String[] args = {"0", "five"};
        assertFalse(InputValidator.validateInput(args));
    }
}
