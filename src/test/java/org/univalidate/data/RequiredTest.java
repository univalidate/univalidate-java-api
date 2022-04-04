package org.univalidate.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequiredTest {

    @Test
    @DisplayName("Validate for null input, with value true will return false")
    void validate_nullInput_valueTrue_returnsFalse() {
        final RequiredValidator requiredValidator = new RequiredValidator(true);

        assertFalse(requiredValidator.validate(null));
    }

    @Test
    @DisplayName("Validate for non null input, with value true will return true")
    void validate_nonNullInput_valueTrue_returnsTrue() {
        final RequiredValidator requiredValidator = new RequiredValidator(true);

        assertTrue(requiredValidator.validate("Hello, World!"));
    }

    @Test
    @DisplayName("Validate for null input, with value false will return true")
    void validate_nullInput_valueFalse_returnsTrue() {
        final RequiredValidator requiredValidator = new RequiredValidator(false);
        assertTrue(requiredValidator.validate(null));
    }

    @Test
    @DisplayName("Validate for non null input, with value false will return true")
    void validate_nonNullInput_valueFalse_returnsTrue() {
        final RequiredValidator requiredValidator = new RequiredValidator(false);
        assertTrue(requiredValidator.validate("Hello, World!"));
    }
}
