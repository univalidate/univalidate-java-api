package org.univalidate.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.univalidate.api.Validator;
import org.univalidate.data.common.NumberProperty;

/**
 * The length {@link Validator} asserts that the length of a given string is
 * within an acceptable range.
 * */
@Data
@AllArgsConstructor
public class LengthValidator implements Validator<String> {

    private final String name = "length";

    /**
     * The minimum acceptable length of a given string.
     * */
    private final NumberProperty min;

    /**
     * The maximum acceptable length of a given string.
     * */
    private final NumberProperty max;

    /**
     * Convenience constructor.
     * */
    public LengthValidator(int min, int max) {
        this.min = new NumberProperty(min);
        this.max = new NumberProperty(max);
    }

    @Override
    public boolean validate(String in) {
        return in == null || in.length() >= min.getValue() && in.length() <= max.getValue();
    }
}
