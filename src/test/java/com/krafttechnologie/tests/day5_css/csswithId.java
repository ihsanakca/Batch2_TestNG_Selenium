package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class csswithId {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

       // WebElement inputSearchBox = driver.findElement(By.id("twotabsearchtextbox"));

        WebElement searchBox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("CSS");

        WebElement searchButton=driver.findElement(By.cssSelector("#nav-search-submit-button"));
        searchButton.click();

        Thread.sleep(3000);

        driver.close();

    }

}
