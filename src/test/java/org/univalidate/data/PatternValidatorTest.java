package org.univalidate.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PatternValidatorTest {

    private static final Pattern TEST_PATTERN = Pattern.compile("(?:www\\.)?(\\w+)\\.(com|net|co\\.uk)", Pattern.CASE_INSENSITIVE);

    @Test
    @DisplayName("Validate when pattern matches returns true")
    void validate_patternMatches_returnsTrue() {
        final PatternValidator patternValidator = new PatternValidator(TEST_PATTERN);
        assertTrue(patternValidator.validate("www.google.com"));
    }

    @Test
    @DisplayName("Validate when input is null returns false")
    void validate_inputNull_returnsTrue() {
        final PatternValidator patternValidator = new PatternValidator(TEST_PATTERN);
        assertTrue(patternValidator.validate(null));
    }

    @Test
    @DisplayName("Validate when input doesn't match returns false")
    void validate_patternNotMatches_returnFalse() {
        final PatternValidator patternValidator = new PatternValidator(TEST_PATTERN);
        assertFalse(patternValidator.validate("test123"));
    }
}
