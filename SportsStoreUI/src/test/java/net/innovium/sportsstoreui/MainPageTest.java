package net.innovium.sportsstoreui;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;


    @BeforeEach
    public void setUp() {
      //  ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        ///options.addArguments("--remote-allow-origins=*");
        //driver = new ChromeDriver(options);
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://sportsstore.innovium.net/");

    }

    @Test
    public void  order(){

        //Select Product
       driver.findElement(By.linkText("Chess")).click();
       {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card:nth-child(1) h4")));
       }

       // add to Cart
       driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
        }
        //goToCheckOut
        driver.findElement(By.linkText("Checkout")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
        }

        //Order
        driver.findElement(By.id("Name")).sendKeys("John Doe");
        driver.findElement(By.name("Line1")).sendKeys("ABC Bulv.");
        driver.findElement(By.name("Line2")).sendKeys("996677 Str.");
        driver.findElement(By.name("Line3")).sendKeys("No:10");
        driver.findElement(By.id("City")).sendKeys("New York");
        driver.findElement(By.id("State")).sendKeys("NY");
        driver.findElement(By.id("Zip")).sendKeys("456677");
        driver.findElement(By.id("Country")).sendKeys("USA");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        {
            WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h2")));
        }

        Assertions.assertEquals(driver.findElement(By.cssSelector("h2")).getText(),"Thanks!");
        driver.findElement(By.linkText("Return to Store")).click();

    }

    @AfterEach
    public void tearDown() {
       // driver.quit();
    }

}
