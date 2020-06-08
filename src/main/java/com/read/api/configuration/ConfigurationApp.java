package com.read.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ConfigurationApp
{

    public static Environment env;
    public static String configurationFile;
    public static String loggingFile;
    public static String layoutFieldsFile;
    public static String layoutFiltersFile;

    @Autowired
    public ConfigurationApp(Environment environment)
    {
        env = environment;

        configurationFile = getOrDefault("schedule.config.file", "./config/configuration.xml");
        loggingFile = getOrDefault("logging.config", "./config/log4j2.xml");
        layoutFieldsFile = getOrDefault("layout.fields.file", "./config/layout.xml");
        layoutFiltersFile = getOrDefault("layout.filters.file", "./config/filters.xml");

        AppExecution.start();
    }

    private static String getOrDefault(String property, String defaultValue)
    {
        String a = env.getProperty(property) != null && !env.getProperty(property).trim().equals("") ? env.getProperty(property) : defaultValue;
        return a;
    }

}
