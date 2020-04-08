package seleniumGlueCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver= Hooks.getDriver();

    @Given ("^El usuario se encuenta en la pagina home de iamalittletester$")
    public void el_usuario_se_encuenta_en_la_pagina_home_de_iamalittletester() throws Throwable {
        String tittleHomePage= "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(tittleHomePage, driver.getTitle());
        //Verifica que el usuario este en home con el titulo esperado
    }

    @When ("^Hace click sobre el boton the little testes comics\\.$")
    public void hace_click_sobre_el_boton_the_little_testes_comics() throws Throwable {
        WebElement littComicLocator = driver.findElement(By.id("menu-item-2008"));
        littComicLocator.click();
    }

    @Then ("^Se debe redirigir a la pantalla comics\\.$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        WebElement pageLittleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente ",pageLittleLocator.isDisplayed() );
        Assert.assertEquals("Category: comics" , pageLittleLocator.getText() );
    }


}
