package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class ComputerPage extends Utility {

    public By desktopLink = By.partialLinkText("Desktops");
    public By productNames = By.cssSelector(".product-title");
    public By selectFilter = By.id("products-orderby");
    public By addToCart = By.xpath("//button[text()='Add to cart']");
    public By buildText = By.xpath("//h1[text()='Build your own computer']");
    public By processor = By.id("product_attribute_1");
    public By ram = By.id("product_attribute_2");
    public By hdd400Gb = By.id("product_attribute_3_7");
    public By osVistaPremium = By.id("product_attribute_4_9");
    public By softwareTotalCommander = By.id("product_attribute_5_12");
    public By totalPrice = By.id("price-value-1");
    public By addToCartButton = By.id("add-to-cart-button-1");
    public By confirmationMessage = By.xpath("//p[@class='content']");
    public By closeButton = By.xpath("//span[@class='close']");
    public By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    public By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");
    public By shoppingCartMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public By qtyUp = By.xpath("//div[@class='quantity up']");
    public By updatedTotal = By.xpath("//span[@class='product-subtotal']");
    public By agreeTermsCheckBox = By.id("termsofservice");
    public By checkOutButton = By.id("checkout");
    public By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public By guestCheckoutButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
    public By firstName = By.id("BillingNewAddress_FirstName");
    public By lastName = By.id("BillingNewAddress_LastName");
    public By emailId = By.id("BillingNewAddress_Email");
    public By country = By.id("BillingNewAddress_CountryId");
    public By city = By.id("BillingNewAddress_City");
    public By address1 = By.id("BillingNewAddress_Address1");
    public By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    public By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public By continueButton = By.name("save");
    public By radioButtonNextDay = By.id("shippingoption_1");
    public By continueDelivery = By.cssSelector(".button-1.shipping-method-next-step-button");
    public By radioButtonCredit = By.id("paymentmethod_1");
    public By continutToPayment = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public By creditCardDropdown = By.id("CreditCardType");
    public By cardHolderName = By.id("CardholderName");
    public By creditCardNumber = By.id("CardNumber");
    public By expiryYear = By.id("ExpireYear");
    public By cardCVV = By.id("CardCode");
    public By continuePayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By creditCardText = By.xpath("//span[normalize-space()='Credit Card']");
    public By deliveryMethodText = By.xpath("//span[normalize-space()='Next Day Air']");
    public By totalAmount = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    public By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    public By proceedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By finalContinue = By.xpath("//button[contains(text(),'Continue')]");
    public By welcomeText = By.xpath("//h2[normalize-space()='Welcome to our store']");


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

    //Send text method
    public void sendText(By by, String value) {
        sendTextToElement(by, value);
    }

    //Conert list to descending order
    public List<String> getProductNamesInDefaultFilterAndSortByDescendingOrder() {
        return convertArrayListToReverseOrder(productNames);
    }

    //Select from drop down method
    public void selectFilter(String value) {
        selectByValueFromDropDown(selectFilter, value);
    }

    //Get list after applying filter
    public List<String> getProductNamesAfterFilterZtoA() {
        return afterFilterProductNames(productNames);
    }

}
