package com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicial {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dresses')]")
    WebElement opcionDeVestidos;

    //constructor
    public PaginaInicial(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEnOpcionVestidos(){
        clickEnElemento(opcionDeVestidos);
    }

    public void clickEnElemento(WebElement element){
        element.click();
    }

}
