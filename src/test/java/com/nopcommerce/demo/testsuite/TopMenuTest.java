package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 1. create class "TopMenuTest" into testsuite package
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 * select the Menu and click on it and verify the page navigation.
 */
public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        List<String> expectedText = Arrays.asList("Computers",
                "Electronics",
                "Apparel",
                "Digital downloads",
                "Books",
                "Jewelry",
                "Gift Cards"
        );
        List<String> actualText = homePage.getTestFromAllMenu();
        //compare both the list
        Assert.assertEquals(actualText, expectedText, "topMenu is not Display");
    }

}
