package org.univalidate.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthValidatorTest {

    @Test
    @DisplayName("Validate with short string returns false")
    void validate_shortString_returnsFalse() {
        final LengthValidator lengthValidator = new LengthValidator(5, 10);
        assertFalse(lengthValidator.validate("123"));
    }

    @Test
    @DisplayName("Validate with long string returns false")
    void validate_longString_returnsFalse() {
        final LengthValidator lengthValidator = new LengthValidator(5, 10);
        assertFalse(lengthValidator.validate("1234567891011213145"));
    }

    @Test
    @DisplayName("Validate with correct length returns true")
    void validate_correctLength_returnsTrue() {
        final LengthValidator lengthValidator = new LengthValidator(5, 10);
        assertTrue(lengthValidator.validate("12345657"));
    }

    @Test
    @DisplayName("Validate with null value returns true")
    void validate_nullValue_returnsTrue() {
        final LengthValidator lengthValidator = new LengthValidator(5, 10);
        assertTrue(lengthValidator.validate(null));
    }
}
