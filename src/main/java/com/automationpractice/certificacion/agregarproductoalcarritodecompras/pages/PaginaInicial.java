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

    @FindBy(xpath = "//input[@id='search_query_top']")
    WebElement campoBuscar;

    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement botonBuscar;

    //constructor
    public PaginaInicial(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enviarProducto(String opcionVestidos){
        enviarTexto(campoBuscar, opcionVestidos);
    }

    public void clickBotonBuscar(){
        esperarElemento(botonBuscar);
        clickEnElemento(botonBuscar);
    }

    public void clickEnElemento(WebElement element){
        element.click();
    }

    public void esperarElemento(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void enviarTexto(WebElement element,String text){
        element.sendKeys(text);
    }

}
