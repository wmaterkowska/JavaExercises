import org.example.PasswordValidator;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.AssertJUnit.assertEquals;

public class PasswordValidatorTest {

    @Test
    public static void validPasswordTest() {
        String password = "FooBar123!";
        assertEquals((Boolean) true, PasswordValidator.validatePassword(password));
    }

    @Test
    public static void invalidPasswordTest() {
        String password1 = "FooBar";
        assertEquals((Boolean) false, PasswordValidator.validatePassword(password1));
    }

    @Test
    public static void invalidPasswordWithSpaceTest() {
        String password2 = "FooBar 123!";
        assertEquals((Boolean) false, PasswordValidator.validatePassword(password2));
    }
}
