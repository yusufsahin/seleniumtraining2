package net.innovium.sportstorenavigation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MainPageTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp()
    {
      System.setProperty("webdriver.chrome.driver", "C:\\opt\\chrome-win64\\chromedriver.exe");
        WebDriver driver ;
        ChromeOptions options= new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       // driver = new FirefoxDriver();
        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
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




        driver.findElement(By.linkText("Ches")).click();
        driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
/*
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        *//*
        driver.findElement(By.linkText("Continue shopping")).click();
        driver.findElement(By.xpath("(//button[@type=\'submit\'])[2]")).click();
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).sendKeys("John Doe");
        driver.findElement(By.name("Line1")).click();
        driver.findElement(By.name("Line1")).sendKeys("ABC Bulv");
        driver.findElement(By.id("Line2")).click();
        driver.findElement(By.id("Line2")).sendKeys("No 6");
        driver.findElement(By.id("City")).click();
        driver.findElement(By.id("City")).sendKeys("New York");
        driver.findElement(By.id("State")).click();
        driver.findElement(By.id("State")).sendKeys("NY");
        driver.findElement(By.id("Zip")).click();
        driver.findElement(By.id("Zip")).sendKeys("0111");
        driver.findElement(By.id("Country")).click();
        driver.findElement(By.id("Country")).sendKeys("USA");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector("h2"));
            assert(elements.size() > 0);
        }
     //   assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Thanks!"));
        driver.findElement(By.linkText("Return to Store")).click();

        driver.quit();*/
    }
}
