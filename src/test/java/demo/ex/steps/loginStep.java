package demo.ex.steps;

import demo.ex.pages.loginPage;
import net.thucydides.core.annotations.Step;

public class loginStep extends loginPage {

    @Step("Ingresar usuario {0}")
    public void sendKeysUserName(String username){
        txt_userName.sendKeys(username);
    }

    @Step("Ingresar contraseña {0}")
    public void sendKeysPassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el botón login")
    public void clickLogin(){
       btn_login.click();
    }

    @Step("Validar visualización del módulo productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualización del mensaje de error")
    public Boolean errorMessageIsVisible(){
        return lbl_errorLoginMessage.isDisplayed();
    }


}
