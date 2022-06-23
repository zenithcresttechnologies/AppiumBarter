package actions;

import org.json.simple.parser.ParseException;
import org.seleniumhq.jetty9.util.security.Password;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.w3c.dom.ls.LSOutput;
import pages.*;
import utility.JsonReader;
import utility.ScrollManager;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class SignUpTest extends CapabilitySetup {

    SoftAssert softAssert = new SoftAssert();
    @DataProvider(name = "Signup Test Cases")
    public Object [][] passData() throws IOException, ParseException {
        return JsonReader.getJSONdata(System.getProperty("user.dir") +
                "/resources/testData/TestData.json", "Signup Credentials", 8);
    }
    @Test(dataProvider = "Signup Test Cases", priority = 1)
    public void signUpPass(String email, String phoneNumber, String OTP, String fullName, String password, String PAN, String cardExpiry, String cvv) throws InterruptedException{
        //Instantiate Signup Page
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickCreateAccount();
        System.out.println("Create Account Button is clicked");

        softAssert.assertEquals(signUpPage.accountPageDisplayed().isDisplayed(),true);//Assert SignUp page
        if(signUpPage.accountPageDisplayed().isDisplayed()){
            System.out.println("Create Account Page is displayed");
        }


        signUpPage.enterValidEmail(email);

        softAssert.assertNotNull(signUpPage.getEmail(), "Null Text");//Assert Email field not empty
        System.out.println("Valid Email is entered");
        signUpPage.clickCountryCode();
        signUpPage.clickNigeriaCode();
        signUpPage.enterValidPhone(phoneNumber);
        softAssert.assertNotNull(signUpPage.getPhoneNumber(), "Null Text");//Assert Phone field not empty
        System.out.println("Valid Phone Number is entered");
        signUpPage.clickContinueBtn();
        System.out.println("Continue Button is clicked");
        softAssert.assertEquals(signUpPage.termsPageDisplayed().isDisplayed(),true);//Assert Terms page
        if(signUpPage.termsPageDisplayed().isDisplayed()){
            System.out.println("Terms and Condition Page is displayed");
        }

        signUpPage.clickAgreeBtn();
        System.out.println("Agree Button is clicked");

        softAssert.assertEquals(signUpPage.otpPageDisplayed().isDisplayed(),true);//Assert OTP page
        if(signUpPage.otpPageDisplayed().isDisplayed()){
            System.out.println("OTP Page is displayed");
        }

        signUpPage.enterOtp(OTP);
        System.out.println("Otp is entered");
        signUpPage.clickConfirmPhoneNumberBtn();
        System.out.println("Confirm Button is clicked");

        softAssert.assertEquals(signUpPage.fullNamePageDisplayed().isDisplayed(),true);//Assert FullName page
        if(signUpPage.fullNamePageDisplayed().isDisplayed()){
            System.out.println("Full Name Page is displayed");
        }

        signUpPage.enterFullName(fullName);
        softAssert.assertNotNull(signUpPage.getFullName(), "Null Text");
        System.out.println("Full Name is entered");
        signUpPage.clickContinueBtn();

        softAssert.assertEquals(signUpPage.passwordPageDisplayed().isDisplayed(),true);//Assert Password page
        if(signUpPage.passwordPageDisplayed().isDisplayed()){
            System.out.println("Password Page is displayed");
        }

        signUpPage.enterPassword(password);
        softAssert.assertNotNull(signUpPage.getPassword(), "Null Text");
        System.out.println("Valid Password is entered");
        signUpPage.clickShowPassword();
        signUpPage.clickContinueBtn();

        softAssert.assertEquals(signUpPage.cardPageDisplayed().isDisplayed(),true);//Assert Card page
        if(signUpPage.cardPageDisplayed().isDisplayed()){
            System.out.println("Card Page is displayed");
        }

        signUpPage.enterCardNumber(PAN);
        softAssert.assertNotNull(signUpPage.getCardNumber().getText(), "Null Text");
        System.out.println("Card Number is entered");
        signUpPage.enterCardExpiry(cardExpiry);
        softAssert.assertNotNull(signUpPage.getCardExpiry().getText(), "Null Text");
        System.out.println("Card Expiry is entered");
        signUpPage.enterCvv(cvv);
        softAssert.assertNotNull(signUpPage.getCvv().getText(), "Null Text");
        System.out.println("CVV is entered");
        signUpPage.clickSkipBtn();
        System.out.println("Skip Button is clicked");

        softAssert.assertEquals(signUpPage.invitePageDisplayed().isDisplayed(),true);//Assert Invite page
        if(signUpPage.invitePageDisplayed().isDisplayed()){
            System.out.println("Barter Invite Contact Page is displayed");
        }

        signUpPage.clickSkipBtn();
        System.out.println("Skip Button is clicked");

        softAssert.assertEquals(signUpPage.homePageDisplayed().isDisplayed(),true);//Assert Home page
        if(signUpPage.homePageDisplayed().isDisplayed()){
            System.out.println("Home Page is displayed");
        }

        signUpPage.clickSettingsBtn();
        System.out.println("Setting Button is clicked");

        ScrollManager scrollManager = new ScrollManager(driver);
        scrollManager.scrollToText("Sign out");
        ///signUpPage.clickSignOut();
        System.out.println("Signed out");
        softAssert.assertAll();//every assertion put assert all

    }



    @Test(dataProvider = "Signup Test Cases", priority = 2)
    public void signUpInvalid(String email, String phoneNumber, String OTP, String fullName, String password, String PAN, String cardExpiry, String cvv) throws InterruptedException{
        //Instantiate Signup Page
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickCreateAccount();
        System.out.println("Create Account Button is clicked");

        softAssert.assertEquals(signUpPage.accountPageDisplayed().isDisplayed(),true);//Assert SignUp page
        if(signUpPage.accountPageDisplayed().isDisplayed()){
            System.out.println("Create Account Page is displayed");
        }


        signUpPage.enterValidEmail(email);

        softAssert.assertNotNull(signUpPage.getEmail(), "Null Text");//Assert Email field not empty
        System.out.println("Valid Email is entered");
        signUpPage.clickCountryCode();
        signUpPage.clickNigeriaCode();
        signUpPage.enterValidPhone(phoneNumber);
        softAssert.assertNotNull(signUpPage.getPhoneNumber(), "Null Text");//Assert Phone field not empty
        System.out.println("Valid Phone Number is entered");
        signUpPage.clickContinueBtn();
        System.out.println("Continue Button is clicked");
        softAssert.assertEquals(signUpPage.termsPageDisplayed().isDisplayed(),true);//Assert Terms page
        if(signUpPage.termsPageDisplayed().isDisplayed()){
            System.out.println("Terms and Condition Page is displayed");
        }

        signUpPage.clickAgreeBtn();
        System.out.println("Agree Button is clicked");

        softAssert.assertEquals(signUpPage.otpPageDisplayed().isDisplayed(),true);//Assert OTP page
        if(signUpPage.otpPageDisplayed().isDisplayed()){
            System.out.println("OTP Page is displayed");
        }

        signUpPage.enterOtp(OTP);
        System.out.println("Otp is entered");
        signUpPage.clickConfirmPhoneNumberBtn();
        System.out.println("Confirm Button is clicked");

        softAssert.assertEquals(signUpPage.fullNamePageDisplayed().isDisplayed(),true);//Assert FullName page
        if(signUpPage.fullNamePageDisplayed().isDisplayed()){
            System.out.println("Full Name Page is displayed");
        }

        signUpPage.enterFullName(fullName);
        softAssert.assertNotNull(signUpPage.getFullName(), "Null Text");
        System.out.println("Full Name is entered");
        signUpPage.clickContinueBtn();

        softAssert.assertEquals(signUpPage.passwordPageDisplayed().isDisplayed(),true);//Assert Password page
        if(signUpPage.passwordPageDisplayed().isDisplayed()){
            System.out.println("Password Page is displayed");
        }

        signUpPage.enterPassword(password);
        softAssert.assertNotNull(signUpPage.getPassword(), "Null Text");
        System.out.println("Valid Password is entered");
        signUpPage.clickShowPassword();
        signUpPage.clickContinueBtn();

        softAssert.assertEquals(signUpPage.cardPageDisplayed().isDisplayed(),true);//Assert Card page
        if(signUpPage.cardPageDisplayed().isDisplayed()){
            System.out.println("Card Page is displayed");
        }

        signUpPage.enterCardNumber(PAN);
        softAssert.assertNotNull(signUpPage.getCardNumber().getText(), "Null Text");
        System.out.println("Card Number is entered");
        signUpPage.enterCardExpiry(cardExpiry);
        softAssert.assertNotNull(signUpPage.getCardExpiry().getText(), "Null Text");
        System.out.println("Card Expiry is entered");
        signUpPage.enterCvv(cvv);
        softAssert.assertNotNull(signUpPage.getCvv().getText(), "Null Text");
        System.out.println("CVV is entered");
        signUpPage.clickSkipBtn();
        System.out.println("Skip Button is clicked");

        softAssert.assertEquals(signUpPage.invitePageDisplayed().isDisplayed(),true);//Assert Invite page
        if(signUpPage.invitePageDisplayed().isDisplayed()){
            System.out.println("Barter Invite Contact Page is displayed");
        }

        signUpPage.clickSkipBtn();
        System.out.println("Skip Button is clicked");

        softAssert.assertEquals(signUpPage.homePageDisplayed().isDisplayed(),true);//Assert Home page
        if(signUpPage.homePageDisplayed().isDisplayed()){
            System.out.println("Home Page is displayed");
        }

        signUpPage.clickSettingsBtn();
        System.out.println("Setting Button is clicked");

        ScrollManager scrollManager = new ScrollManager(driver);
        scrollManager.scrollToText("Sign out");
        ///signUpPage.clickSignOut();
        System.out.println("Signed out");
        softAssert.assertAll();//every assertion put assert all

    }

}
