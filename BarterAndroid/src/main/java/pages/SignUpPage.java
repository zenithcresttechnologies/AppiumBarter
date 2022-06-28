package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;
import java.util.Random;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage{
    AndroidDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, 3);
    //Randomization instantiation
    /*  Random rand = new Random();

    //Randomize Variables
    String phoneNumber = null;
    String email = null;*/

    //The Mobile Element Variables
    @AndroidFindBy(id="com.flutterwave.flybarter:id/createAccountBtn")
    private WebElement createAcc;
    @AndroidFindBy(xpath="//android.view.ViewGroup[@index = '2']")
    private WebElement createAccountPage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/emailEt")
    private WebElement emailField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/imageView_arrow")
    private WebElement countryCode;
    @AndroidFindBy(xpath="//android.widget.TextView[@text = 'Nigeria (NG)']")
    private WebElement nigeriaCode;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/phoneEt")
    private WebElement phoneField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/continueBtn")
    private WebElement continueBtn;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/tclabel")
    private WebElement termsPage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/disagree")
    private WebElement disagreeBtn;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/agree")
    private WebElement agreeBtn;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/titleTV")
    private WebElement otpPage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/pinView")
    private WebElement otpField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/verifyBtn")
    private WebElement confirmPhoneNumber;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[@index = '2']")
    private WebElement fullNamePage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/fullNameEt")
    private WebElement fullNameField;
    @AndroidFindBy(xpath="//android.widget.TextView[@text = 'Create an account']")
    private WebElement passwordPage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/passwordEt")
    private WebElement passwordField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/text_input_end_icon")
    private WebElement showPassword;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/titleTV")
    private WebElement cardPage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/cardNumberEt")
    private WebElement cardNumberField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/cardExpiryEt")
    private WebElement cardExpiryField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/cvvEt")
    private WebElement cvvField;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/skipBtn")
    private WebElement skipBtn;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/constraintContainer")
    private WebElement barterInvitePage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/infoLay")
    private WebElement homePage;
    @AndroidFindBy(id="com.flutterwave.flybarter:id/settingsIconIV")
    private WebElement settingsBtn;
    @AndroidFindBy(xpath="//*[@text = 'Sign out']")
    private WebElement signOut;




   public SignUpPage(AndroidDriver <AndroidElement>driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
       //For your Page Object Model
    }

    public WebElement clickCreateAccount(){
       createAcc.click();
        return createAcc;
    }

    public WebElement accountPageDisplayed(){
        return createAccountPage;
    }


    public WebElement enterValidEmail(String email){
    try{
        emailField.clear();
        emailField.sendKeys(email);
        return emailField;
    }
    catch (Exception e){
        throw new RuntimeException(e.getMessage());
    }

    }

    public WebElement getEmail(){
       try {
           emailField.getText();
           return emailField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement clickCountryCode(){
       try{
           countryCode.click();
           return countryCode;
       }

       catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public WebElement clickNigeriaCode(){
       try{
           nigeriaCode.click();
           return nigeriaCode;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }

    }


    public WebElement enterValidPhone(String phoneNumber){
    try{
        phoneField.clear();
        phoneField.sendKeys(phoneNumber);
        return phoneField;
    }
    catch (Exception e){
        throw new RuntimeException(e.getMessage());
    }
    }

    public WebElement getPhoneNumber(){
       try{
           phoneField.getText();
           return emailField;
       }

        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public WebElement clickContinueBtn(){
        try{
            continueBtn.click();
            return continueBtn;
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public WebElement clickDisagreeBtn(){
       try{
           //wait.until(ExpectedConditions.visibilityOf(disagreeBtn));
           disagreeBtn.click();
           return disagreeBtn;
       }

        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public WebElement termsPageDisplayed(){
        return termsPage;
    }

    public WebElement clickAgreeBtn(){
       try{
           agreeBtn.click();
           return agreeBtn;
       }

        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public WebElement otpPageDisplayed(){
        return otpPage;
    }

    public WebElement enterOtp(String OTP){
       try{
           otpField.sendKeys(OTP);
           return otpField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }


    public WebElement clickConfirmPhoneNumberBtn(){
       try{
           confirmPhoneNumber.click();
           return confirmPhoneNumber;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }

    }

    public WebElement fullNamePageDisplayed(){
        return fullNamePage;
    }

    public WebElement enterFullName(String fullName){
       try{
           fullNameField.clear();
           fullNameField.sendKeys(fullName);
           return fullNameField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement getFullName(){
       try{
           fullNameField.getText();
           return fullNameField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement passwordPageDisplayed(){
        return passwordPage;
    }

    public WebElement enterPassword(String password){
       try{
           passwordField.clear();
           passwordField.sendKeys(password);
           return passwordField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement getPassword(){
       try{
           passwordField.getText();
           return passwordField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement clickShowPassword(){
       try{
           showPassword.click();
           return showPassword;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement cardPageDisplayed(){
        return cardPage;
    }

    public WebElement enterCardNumber(String cardNumber){
       try{
           cardNumberField.clear();
           cardNumberField.sendKeys(cardNumber);
           return cardNumberField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement getCardNumber(){
       try{
           cardNumberField.getText();
           return cardNumberField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement enterCardExpiry(String cardExpiry){
       try{
           cardExpiryField.clear();
           cardExpiryField.sendKeys(cardExpiry);
           return cardExpiryField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement getCardExpiry(){
       try{
           cardExpiryField.getText();
           return cardExpiryField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement enterCvv(String CVV){
       try{
           cvvField.clear();
           cvvField.sendKeys(CVV);
           return passwordField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement getCvv(){
       try{
           cvvField.getText();
           return cvvField;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement invitePageDisplayed(){
        return barterInvitePage;
    }

    public WebElement clickSkipBtn(){
        try{
            skipBtn.click();
            return skipBtn;
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public WebElement homePageDisplayed(){
        return homePage;
    }

    public WebElement clickSettingsBtn(){
       try{
           settingsBtn.click();
           return settingsBtn;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }

    public WebElement clickSignOut(){
       try{
           signOut.click();
           return signOut;
       }
       catch (Exception e){
           throw new RuntimeException(e.getMessage());
       }
    }


}
