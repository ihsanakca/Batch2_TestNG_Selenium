package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssWithContains {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");

        WebElement searchbox= driver.findElement(By.cssSelector("input[class*='OldAutosuggestTheme-']"));
        searchbox.sendKeys("Postman");

        WebElement searcBTn= driver.findElement(By.cssSelector("div[class*='Old-cHxjyU99'] "));

        searcBTn.click();
    }
}
