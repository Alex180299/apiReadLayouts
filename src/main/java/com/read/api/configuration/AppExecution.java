package com.read.api.configuration;

import com.read.app.App;
import com.read.app.configuration.ConfigurationModule;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppExecution
{

    public static void start(){
        ConfigurationModule.configurationFile = ConfigurationApp.configurationFile;
        ConfigurationModule.loggingFile = ConfigurationApp.loggingFile;
        ConfigurationModule.layoutFieldsFile = ConfigurationApp.layoutFieldsFile;
        ConfigurationModule.layoutFiltersFile = ConfigurationApp.layoutFiltersFile;
        App.init();
    }

}
