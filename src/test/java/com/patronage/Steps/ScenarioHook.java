package com.patronage.Steps;

import com.patronage.DriverFactory;
import cucumber.api.java8.En;


public class ScenarioHook extends DriverFactory implements En{

        public ScenarioHook() {

            //initialize WebDriver
            Before(() -> {
                driver = new DriverFactory().getDriver();
            });

            //destroy WebDriver
            After(() -> {
                new DriverFactory().destroyDriver();
            });

        }
}
