package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {


    @FindBy(id = "firstName")
    public static  WebElement firstNameField;

    @FindBy(id = "lastName")
    public static WebElement lastNameField;

    @FindBy(id = "userEmail")
    public static  WebElement emailField;

    @FindBy(id = "userMobile")
    public static  WebElement phoneField;

    @FindBy(css = "select[formcontrolname='occupation']")
    public static WebElement occupationDropdown;

    @FindBy(css = "input[type='radio'][value='Male']")
    public static WebElement maleRadioButton;

    @FindBy(css = "input[type='radio'][value='Female']")
    public static  WebElement femaleRadioButton;

    @FindBy(id = "userPassword")
    public static WebElement passwordField;

    @FindBy(id = "confirmPassword")
    public static WebElement confirmPasswordField;

    @FindBy(css = "input[type='checkbox'][formcontrolname='required']")
    public static WebElement ageCheckbox;

    @FindBy(id = "login")
    public static WebElement registerButton;

   
}