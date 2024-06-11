package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {

    public By topMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li");
    public By computerLink = By.linkText("Computers");

    //Click method
    public void click(By by) {
        clickOnElement(by);
    }

    //selectMenu Method
    public void selectMenu(String menu) {
        List<WebElement> topMenuElement = getMultipleElements(topMenu);
        //click on element as according to parameter
        for (WebElement e : topMenuElement) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    //Get text from all menu tab method
    public List<String> getTestFromAllMenu() {
        List<WebElement> topMenuElement = getMultipleElements(topMenu);

        List<String> printNameOfAllMenus = new ArrayList<>();
        for (WebElement e : topMenuElement) {
            printNameOfAllMenus.add(e.getText());
        }
        List<String> pageHeading = new ArrayList<>();
        //navigate each element one by one
        for (int i = 0; i < printNameOfAllMenus.size(); i++) {
            selectMenu(printNameOfAllMenus.get(i));
            pageHeading.add(getTextFromElement(By.xpath("//h1[contains(text(),'" + printNameOfAllMenus.get(i) + "')]")));
        }
        return pageHeading;
    }
}
