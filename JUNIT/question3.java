package JUNIT;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class question3 {

    // Login validation method
    public static boolean validateLogin(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username or password cannot be null");
        }
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // Let's assume the correct credentials are:
        // username: "admin", password: "1234"
        return username.equals("admin") && password.equals("1234");
    }

    // Inner test class
    public static class LoginTest {

        @Test
        public void testValidLogin() {
            assertTrue(validateLogin("admin", "1234"));
        }

        @Test
        public void testInvalidLogin() {
            assertFalse(validateLogin("admin", "wrongpass"));
            assertFalse(validateLogin("user", "1234"));
            assertFalse(validateLogin("wrong", "wrong"));
        }

        @Test
        public void testEmptyUsernameOrPassword() {
            assertFalse(validateLogin("", "1234"));
            assertFalse(validateLogin("admin", ""));
            assertFalse(validateLogin("", ""));
        }

        @Test
        public void testNullUsernameOrPassword() {
            assertThrows(IllegalArgumentException.class, () -> validateLogin(null, "1234"));
            assertThrows(IllegalArgumentException.class, () -> validateLogin("admin", null));
            assertThrows(IllegalArgumentException.class, () -> validateLogin(null, null));
        }
    }
}
