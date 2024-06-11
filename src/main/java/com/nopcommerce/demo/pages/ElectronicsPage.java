package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    public By electronicsLink = By.linkText("Electronics");
    public By cellPhonesLink = By.linkText("Cell phones");
    public By cellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    public By listTab = By.xpath("//a[normalize-space()='List']");
    public By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public By nokiaLumia1020Text = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    public By price349 = By.id("price-value-20");
    public By qtyBox = By.id("product_enteredQuantity_20");
    public By addToCartButton = By.id("add-to-cart-button-20");
    public By confirmationMessage = By.xpath("//p[@class='content']");
    public By closeButton = By.xpath("//span[@title='Close']");
    public By shoppingCartTab = By.xpath("//span[contains(text(),'Shopping cart')]");
    public By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");
    public By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    public By qty = By.xpath("//div[@class='product-quantity']//input");
    public By total698 = By.xpath("//span[@class='product-subtotal']");
    public By agreeTermsCheckBox = By.id("termsofservice");
    public By checkOutButton = By.id("checkout");
    public By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public By registerTab = By.xpath("//button[normalize-space()='Register']");
    public By registerText = By.xpath("//h1[normalize-space()='Register']");
    public By selectMaleGender = By.id("gender-male");
    public By firstName = By.id("FirstName");
    public By lastName = By.id("LastName");
    public By emailId = By.id("Email");
    public By password = By.id("Password");
    public By confirmPassword = By.id("ConfirmPassword");
    public By date = By.name("DateOfBirthDay");
    public By month = By.name("DateOfBirthMonth");
    public By year = By.name("DateOfBirthYear");
    public By registerButton = By.xpath("//button[@id='register-button']");
    public By completeRegistrationText = By.xpath("//div[@class='result']");
    public By continueTab = By.xpath("//a[normalize-space()='Continue']");
    public By selectCountry = By.id("BillingNewAddress_CountryId");
    public By cityName = By.id("BillingNewAddress_City");
    public By address1 = By.id("BillingNewAddress_Address1");
    public By postalCode = By.id("BillingNewAddress_ZipPostalCode");
    public By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public By continueButton = By.name("save");
    public By radioButton2dayAir = By.id("shippingoption_2");
    public By continueShippingNext = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public By radioCreditCardButton = By.id("paymentmethod_1");
    public By continuePaymentNext = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public By creditcardOption = By.id("CreditCardType");
    public By cardHolderName = By.id("CardholderName");
    public By creditCardNumber = By.id("CardNumber");
    public By expiryYear = By.id("ExpireYear");
    public By cardCode = By.id("CardCode");
    public By continueToDetailsButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By paymentMethodText = By.xpath("//span[normalize-space()='Credit Card']");
    public By shippingMethod2Day = By.xpath("//span[normalize-space()='2nd Day Air']");
    public By finalTotal698 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    public By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    public By orderConfirmationMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By continueButtonAfterPayment = By.xpath("//button[normalize-space()='Continue']");
    public By welcomeToStoreMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    public By logOut = By.xpath("//a[normalize-space()='Log out']");

    //Get text method
    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }

    //Select from dropdown method
    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    //Click on element method
    public void clickOn(By by) {
        clickOnElement(by);
    }

    //Mouse hover and click method
    public void mouseHoverOnElementAndClick(By by) {
        mouseHoverToElementAndClick(by);
    }

    //Mouse hover only method
    public void mouseHoverOnElement(By by) {
        mouseHoverToElement(by);
    }

    //Send text to element method
    public void sendText(By by, String value) {
        sendTextToElement(by, value);
    }

    //Clear box and send text method
    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    //Get attribute method
    public String getAttribute(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    //Generate random email method
    public String generateEmailId() {
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);            //Create random username
        String emailID = "User" + userName + "@example.com";                        //Create random email Id
        return emailID;
    }
}
