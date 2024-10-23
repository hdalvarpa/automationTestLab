package com.examples.ui_test.definitions;

import com.examples.ui_test.steps.loginStep;
import com.examples.ui_test.ultilities.browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class loginDef{

    @Steps(shared = true)
    loginStep loginStep;

    @Given("el usuario ingresa al sitio web")
    public void userNavitacionTo(){
       // brow.navigateTo("https://www.saucedemo.com/v1/");
        browser.start(loginStep,"chrome", "https://www.saucedemo.com/v1/");
    }

    @When("ingresa credenciales validas")
    public void ingresaCredencialesValidas() {
        loginStep.sendKeysUserName("standard_user");
        loginStep.sendKeysPassword("secret_sauce");
        loginStep.clickLogin();
    }

    @Then("la aplicacion deberia mostrar la pantalla principal de productos")
    public void laAplicacionDeberiaMostrarLaPantallaPrincipalDeProductos() {
        Assert.assertTrue(loginStep.titleIsVisible());
    }

    @When("ingresa credenciales invalidas")
    public void ingresaCredencialesInvalidas() {
        loginStep.sendKeysUserName("xyz");
        loginStep.sendKeysPassword("xyz");
        loginStep.clickLogin();
    }

    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void laAplicacionDeberiaMostrarUnMensajeDeError() {
        Assert.assertTrue(loginStep.errorMessageIsVisible());
    }

    @When("ingresar {string} en user name")
    public void ingresarEnUserName(String username) {
        loginStep.sendKeysUserName(username);

    }

    @When("ingresar {string} en password")
    public void ingresarEnPassword(String password) {
        loginStep.sendKeysPassword(password);
    }

    @And("se hace click en Login")
    public void seHaceClickEnLogin() {
        loginStep.clickLogin();
    }
}
