package com.automationpractice.certificacion.agregarproductoalcarritodecompras.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                    features = "src\\test\\java\\com\\automationpractice\\certificacion\\agregarproductoalcarritodecompras\\features\\ProductoEnCarritoDeCompras.feature",
                    glue = "com.automationpractice.certificacion.agregarproductoalcarritodecompras.stepdefinitions",
                    snippets = SnippetType.CAMELCASE
)
public class ProductoEnCarritoDeComprasRunner {
}
