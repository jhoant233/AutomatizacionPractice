package com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginaDeVestidos {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Casual Dresses')]")
    WebElement vestidosCasuales;

    @FindBy(how = How.XPATH, using = "//a[@class='product-name'][contains(text(),'Printed Dress')]")
    WebElement vestidoNaranja;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to cart')]")
    WebElement anadirAlCarrito;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Proceed to checkout')]")
    WebElement continuarConLaCompra;

    public PaginaDeVestidos(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void opcionVestidosCasuales(){
        clickEnElemento(vestidosCasuales);
    }

    public void seleccionarVestidoNaranja(){
        clickEnElemento(vestidoNaranja);
    }

    public void agregarProductoAlCarritoDeCompras(){
        clickEnElemento(anadirAlCarrito);
    }

    public void confirmarCompraDelProducto(){
        clickEnElemento(continuarConLaCompra);
    }

    public void clickEnElemento(WebElement element){
        element.click();
    }

}
