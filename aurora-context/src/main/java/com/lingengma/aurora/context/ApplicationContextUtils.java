package com.lingengma.aurora.context;


import java.util.Objects;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
/**
 * @author LingengMa
 * @date 2025/10/02 16:06
 * @Description:
 */


public class ApplicationContextUtils {

    private static ApplicationContext applicationContext = null;

    @Nonnull
    public static ApplicationContext getRequiredApplicationContext() {
        return Objects.requireNonNull(getApplicationContext(), "ApplicationContext is not set.");
    }

    @Nullable
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    static void setApplicationContext(ApplicationContext ctx) {
        applicationContext = ctx;
    }
}
