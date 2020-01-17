package com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaInicial {

    private WebDriver driver;

    @FindBy(linkText = "DRESSES")
    WebElement opcionDeVestidos;


    //constructor
    public PaginaInicial(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEnOpcionVestidos(){
        esperarElemento(opcionDeVestidos);
        clickEnElemento(opcionDeVestidos);
    }

    public void clickEnElemento(WebElement element){
        element.click();
    }

    public void esperarElemento(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
