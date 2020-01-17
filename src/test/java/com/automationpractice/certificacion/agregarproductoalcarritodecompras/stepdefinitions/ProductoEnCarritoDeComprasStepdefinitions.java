package com.automationpractice.certificacion.agregarproductoalcarritodecompras.stepdefinitions;

import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaCarritoDeCompras;
import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaDeVestidos;
import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaInicial;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductoEnCarritoDeComprasStepdefinitions {

    private String PATHDRIVER = "src\\test\\resources\\drivers\\";
    private String baseURL = "http://automationpractice.com/";
    WebDriver driver;

    @Given("^Johan ingreso a la pagina automationpractice$")
    public void johanIngresoALaPaginaAutomationpractice() throws Exception {
        System.setProperty("webdriver.chrome.driver",PATHDRIVER+"chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @When("^El selecciona un producto de la tienda$")
    public void elSeleccionaUnProductoDeLaTienda() throws Exception {
        driver.get(baseURL);
        PaginaInicial paginaInicial = new PaginaInicial(driver);
        paginaInicial.clickEnOpcionVestidos();
        PaginaDeVestidos paginaDeVestidos = new PaginaDeVestidos(driver);
        paginaDeVestidos.opcionVestidosCasuales();
        paginaDeVestidos.seleccionarVestidoNaranja();
        paginaDeVestidos.agregarProductoAlCarritoDeCompras();
        paginaDeVestidos.confirmarCompraDelProducto();
    }

    @Then("^El puede verlo agregado al carrito de compras$")
    public void elPuedeVerloAgregadoAlCarritoDeCompras() throws Exception {
        PaginaCarritoDeCompras paginaCarritoDeCompras = new PaginaCarritoDeCompras(driver);
        Assert.assertTrue(paginaCarritoDeCompras.productoEnCarritoDeCompras("Printed Dress"));
        driver.close();
    }
}
