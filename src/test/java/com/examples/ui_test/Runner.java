package com.examples.ui_test;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/examples/ui_test",
        glue = "com.examples.ui_test.definitions",
        tags = "@ValidarCredentialsValid"
)
public class Runner {
}
