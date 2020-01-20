package com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaDeVestidos {
    private WebDriver driver;

    @FindBy(linkText = "Casual Dresses")
    WebElement vestidosCasuales;

    @FindBy(xpath = "//a[@class='product-name'][contains(text(),'Printed Dress')]")
    WebElement vestidoNaranja;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement anadirAlCarrito;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement continuarConLaCompra;

    public PaginaDeVestidos(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickVestidoNaranja(){
        esperarElemento(vestidoNaranja);
        clickEnElemento(vestidoNaranja);
    }

    public void clickAgregarProducto(){
        esperarElemento(anadirAlCarrito);
        clickEnElemento(anadirAlCarrito);
    }

    public void clickConfirmarCompra(){
        esperarElemento(continuarConLaCompra);
        clickEnElemento(continuarConLaCompra);
    }

    public void clickEnElemento(WebElement element){
        element.click();
    }

    public void esperarElemento(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
