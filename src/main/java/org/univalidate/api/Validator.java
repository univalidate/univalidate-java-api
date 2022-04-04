package org.univalidate.api;

/**
 * The base for all validators.
 * @param <T> The type of the object to validate.
 */
public interface Validator<T> {

    /**
     * The name of this validator.
     */
    String getName();

    /**
     * Validates a given object.
     *
     * @param in The object to validate.
     * @return true if the object is valid.
     */
    boolean validate(T in);
}
