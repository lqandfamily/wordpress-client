package com.lq.typecho.tools;

/**
 * @author robin
 */
public abstract class Args {


    private Args() {
        throw new UnsupportedOperationException("Private constructor, cannot be accessed.");
    }

    public static void check(boolean result, String errorMessage) {
        if (result) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public static void checkNotNull(Object source, String errorMessage) {
        check(null == source, errorMessage);
    }
}
