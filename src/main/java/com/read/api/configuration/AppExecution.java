package com.read.api.configuration;

import com.read.app.App;
import com.read.app.configuration.ConfigurationModule;


public class AppExecution
{

    public static void start(){
        ConfigurationModule.configurationFile = ConfigurationApp.configurationFile;
        ConfigurationModule.layoutFieldsFile = ConfigurationApp.layoutFieldsFile;
        ConfigurationModule.layoutFiltersFile = ConfigurationApp.layoutFiltersFile;
        App.init();
    }

}
