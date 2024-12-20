package org.edu.miu.cs.cs544.labw3d6.assignment_1;

import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class Assignment1Application {

//    private final SmartInstantiationAwareBeanPostProcessor smartInstantiationAwareBeanPostProcessor;

//    public Assignment1Application(SmartInstantiationAwareBeanPostProcessor smartInstantiationAwareBeanPostProcessor) {
//        this.smartInstantiationAwareBeanPostProcessor = smartInstantiationAwareBeanPostProcessor;
//    }

    @Bean
    public SessionLocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(java.util.Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang"); // Parameter to change language
        return interceptor;
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(Assignment1Application.class, args);
    }

}
