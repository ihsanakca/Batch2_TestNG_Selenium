package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssWithNthOfType {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");

        WebElement text= driver.findElement(By.cssSelector("div[class='row'] :nth-of-type(1) :nth-of-type(2) "));
        System.out.println("text.getText() = " + text.getText());
    }
}
