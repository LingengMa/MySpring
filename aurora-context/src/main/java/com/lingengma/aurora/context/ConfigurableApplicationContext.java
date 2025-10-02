package com.lingengma.aurora.context;

/**
 * @author LingengMa
 * @date 2025/10/01 17:54
 * @Description:
 */



import jakarta.annotation.Nullable;

import java.util.List;

/**
 * Used for BeanPostProcessor.
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    List<BeanDefinition> findBeanDefinitions(Class<?> type);

    @Nullable
    BeanDefinition findBeanDefinition(Class<?> type);

    @Nullable
    BeanDefinition findBeanDefinition(String name);

    @Nullable
    BeanDefinition findBeanDefinition(String name, Class<?> requiredType);

    Object createBeanAsEarlySingleton(BeanDefinition def);
}
