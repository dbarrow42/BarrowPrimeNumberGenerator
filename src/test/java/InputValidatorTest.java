import com.barrow.primeNumberGenerator.util.InputValidator;
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

    @Test
    void ValidateInputWithFloatArgReturnsFalse() {
        String[] args = {"0", "5.0"};
        assertFalse(InputValidator.validateInput(args));
    }

    @Test
    void ValidateInputWithArgLargerThanIntMaxReturnsFalse() {
        String[] args = {"0", "2147483648"};
        assertFalse(InputValidator.validateInput(args));
    }
}
