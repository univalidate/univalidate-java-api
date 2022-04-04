package org.univalidate.data;

import lombok.Data;
import org.univalidate.api.Property;
import org.univalidate.api.Validator;

/**
 * The required {@link Validator} asserts that the given object is non-null.
 * */
@Data
public class RequiredValidator implements Validator<Object>, Property {

    private final String name = "required";

    /**
     * If this value is true, then this object is required.
     * */
    private final boolean value;

    private String message = "This object is required";

    @Override
    public boolean validate(Object in) {
        return !value || in != null;
    }
}
