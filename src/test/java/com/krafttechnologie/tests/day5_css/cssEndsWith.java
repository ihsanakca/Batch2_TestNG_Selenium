package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class cssEndsWith {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement searchbox= driver.findElement(By.cssSelector("input[id$='-search']    "));
        searchbox.sendKeys("API");

        WebElement searcBTn= driver.findElement(By.cssSelector("input[type$='mit']"));

        searcBTn.click();
    }
}
