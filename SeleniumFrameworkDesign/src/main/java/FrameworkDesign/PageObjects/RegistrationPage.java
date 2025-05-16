package FrameworkDesign.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement emailField;

    @FindBy(id = "userMobile")
    WebElement phoneField;

    @FindBy(css = "select[formcontrolname='occupation']")
    WebElement occupationDropdown;

    @FindBy(css = "input[type='radio'][value='Male']")
    WebElement maleRadioButton;

    @FindBy(css = "input[type='radio'][value='Female']")
    WebElement femaleRadioButton;

    @FindBy(id = "userPassword")
    WebElement passwordField;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordField;

    @FindBy(css = "input[type='checkbox'][formcontrolname='required']")
    WebElement ageCheckbox;

    @FindBy(id = "login")
    WebElement registerButton;

    public void fillFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void fillEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPhone(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void selectOccupation(String occupation) {
        occupationDropdown.sendKeys(occupation);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            maleRadioButton.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            femaleRadioButton.click();
        }
    }

    public void fillPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void fillConfirmPassword(String confirmPassword) {
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void agreeToTerms() {
        if (!ageCheckbox.isSelected()) {
            ageCheckbox.click();
        }
    }

    public void submitRegistration() {
        registerButton.click();
    }
}