package demo.ex.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageObject {

    @FindBy( xpath = "//input[@id='user-name']")
    protected WebElementFacade txt_userName;

    @FindBy( xpath = "//input[@id='password']")
    protected WebElementFacade txt_password;

    @FindBy( xpath = "//input[@id='login-button']")
    protected WebElementFacade btn_login;

    @FindBy( xpath = "//div[text()='Products']")
    protected WebElementFacade lbl_product;

    @FindBy( xpath = "//h3[text()='Username and password do not match any user in this service']")
    protected WebElementFacade lbl_errorLoginMessage;

}
