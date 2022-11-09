package com.krafttechnologie.tests.day9_Webelements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownPractice2 {

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
    2. Checkboxes kutusundan sadece option 1  ve 4 u sec

         */

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        List<WebElement> Options=driver.findElements(By.xpath("//input[@type='checkbox']"));

        Thread.sleep(2000);


        if(!Options.get(0).isSelected()){
            Options.get(0).click();

        }if(!Options.get(3).isSelected()){
            Options.get(3).click();
        }if(Options.get(2).isSelected()){
            Options.get(2).click();
        }


    }
}
