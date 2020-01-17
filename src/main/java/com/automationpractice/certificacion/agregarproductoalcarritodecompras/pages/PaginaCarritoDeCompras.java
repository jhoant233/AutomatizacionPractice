package com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginaCarritoDeCompras {

    private WebDriver driver;

    @FindBy(linkText= "Printed Dress")
    WebElement textoDelProducto;

    public PaginaCarritoDeCompras(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean productoEnCarritoDeCompras(String producto){
        return  textoDelProducto.getText().contains(producto);
    }

}
