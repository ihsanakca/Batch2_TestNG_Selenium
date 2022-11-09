package com.krafttechnologie.tests.day9_Webelements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownPractice3 {

    WebDriver driver;

    @BeforeClass
    public void setUP() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. Radio Button  kutusundaki elementlerin sayisini bul ve tum elementleri yazdir
    3. Blue elementini sec

        */

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@type='radio'] [@name='color']"));
        System.out.println("radioButtons.size() = " + radioButtons.size());
         radioButtons.get(2).click();
         Thread.sleep(3000);
        for (WebElement radio: radioButtons){
            System.out.println("radio.getText() = " + radio.getAttribute("value"));
        }
        WebElement blue= driver.findElement(By.xpath("//input[@value='blue']"));
        blue.click();
    }
}
