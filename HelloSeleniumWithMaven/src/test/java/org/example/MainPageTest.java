package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MainPageTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp()
    {
       // ChromeOptions options= new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  driver.get("http://sportsstore.innovium.net/");
        driver.get("http://sportsstore.innovium.net/");
    }

    @Test
    public  void E2E()
    {

        driver.manage().window().maximize();

         System.out.println(driver.getTitle());

         System.out.println(driver.getPageSource());

     //    driver.quit();




        driver.findElement(By.linkText("Chess")).click();
        driver.findElement(By.xpath("//button[@type=\'submit\']")).click();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
     }
}
