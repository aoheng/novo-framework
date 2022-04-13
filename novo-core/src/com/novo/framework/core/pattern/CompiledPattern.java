package com.novo.framework.core.pattern;

/**
 * A wildcard pattern that has been compiled
 */
public interface CompiledPattern {

    /**
     * Tries to match a value
     * @param value The value to match
     * @return True if fully matched
     */
    boolean matches(String value);

    /**
     * @return The original pattern
     */
    String getOriginal();
}
