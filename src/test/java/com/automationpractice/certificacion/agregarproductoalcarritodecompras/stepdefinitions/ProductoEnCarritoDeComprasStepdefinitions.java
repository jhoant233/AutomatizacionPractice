package com.automationpractice.certificacion.agregarproductoalcarritodecompras.stepdefinitions;

import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaCarritoDeCompras;
import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaDeVestidos;
import com.automationpractice.certificacion.agregarproductoalcarritodecompras.pages.PaginaInicial;
import com.automationpractice.certificacion.agregarproductoalcarritodecompras.util.Producto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ProductoEnCarritoDeComprasStepdefinitions {

    private String PATHDRIVER = "src\\test\\resources\\drivers\\";
    private String baseURL = "http://automationpractice.com/";
    WebDriver driver;


    @Dado("^Johan ingreso a la pagina automationpractice$")
    public void johanIngresoALaPaginaAutomationpractice() throws Exception {
        System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Cuando("^El busca un producto desde el menu$")
    public void elBuscaUnProductoDesdeElMenu(List<Producto> tipoDeProducto) throws Exception {
        driver.get(baseURL);
        PaginaInicial paginaInicial = new PaginaInicial(driver);
        paginaInicial.enviarProducto(tipoDeProducto.get(0).getTipoProducto());
        paginaInicial.clickBotonBuscar();
        PaginaDeVestidos paginaDeVestidos = new PaginaDeVestidos(driver);
        paginaDeVestidos.clickVestidoNaranja();
        paginaDeVestidos.clickAgregarProducto();
        paginaDeVestidos.clickConfirmarCompra();
    }

    @Entonces("^El deberia verlo agregado en el carrito de compras$")
    public void elDeberiaVerloAgregadoEnElCarritoDeCompras(List<Producto> nombreDeProducto) throws Exception {
        PaginaCarritoDeCompras paginaCarritoDeCompras = new PaginaCarritoDeCompras(driver);
        Assert.assertTrue(paginaCarritoDeCompras.productoEnCarritoDeCompras(nombreDeProducto.get(0).getNombreProducto()));
        driver.close();
    }
}