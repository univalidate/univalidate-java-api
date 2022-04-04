package org.univalidate.data;

import lombok.Data;
import org.univalidate.api.Property;
import org.univalidate.api.Validator;

import java.util.regex.Pattern;

/**
 * The pattern {@link Validator} asserts that the given string matches a given regular expression.
 */
@Data
public class PatternValidator implements Validator<String>, Property {

    private final String name = "pattern";
    private final Pattern value;
    private String message = "Must match pattern {value}";

    @Override
    public boolean validate(String in) {
        return in == null || value.matcher(in).matches();
    }
}
