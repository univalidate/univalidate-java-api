package org.univalidate.data.common;

import lombok.Data;
import org.univalidate.api.Validator;

import java.util.HashMap;
import java.util.Map;

@Data
public class UnivalidateSchema {

    private final String version;
    private final Validation validation;

    @Data
    static class Validation {
        private final Map<String, Validator<?>> validators = new HashMap<>();
    }
}
