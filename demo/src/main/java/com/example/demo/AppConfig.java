package com.example.demo;

import ch.qos.logback.core.pattern.Converter;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Configuration
@ComponentScan("com.example.demo")
@EnableJpaRepositories(basePackages = "com.example.demo")
@EnableTransactionManagement
public class AppConfig {

    @Bean(name="localeResolver")
    public LocaleContextResolver getLocaleContextResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl","PL"));
        return localeResolver;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:validationMessages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public Validator validator() {
        LocalValidatorFactoryBean lvfb = new LocalValidatorFactoryBean();
        lvfb.setValidationMessageSource(messageSource());
        return lvfb;
    }

    @Bean

    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver =

                new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/views/");

        viewResolver.setSuffix(".jsp");

        return viewResolver;

    }


//    @Override
//
//    public void configureDefaultServletHandling(
//
//            DefaultServletHandlerConfigurer configurer) {
//
//        configurer.enable();
//
//    }



//    public Set<Converter> getConverters() {
//        Set<Converter> converters = new HashSet<>();
//        converters.add(new ClientConverter());
//        return converters;
//    }
////
//    @Bean(name = "conversionService")
//    public ConversionService getConversionService() {
//        ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
//        factory.setConverters(getConverters());
//        factory.afterPropertiesSet();
//        return factory.getObject();
//    }

}