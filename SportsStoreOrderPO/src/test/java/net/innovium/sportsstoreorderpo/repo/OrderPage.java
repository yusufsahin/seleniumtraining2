package net.innovium.sportsstoreorderpo.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void enterDetils()
    {
        driver.findElement(By.id("Name")).sendKeys("John Doe");
        driver.findElement(By.name("Line1")).sendKeys("ABC Bulv.");
        driver.findElement(By.name("Line2")).sendKeys("996677 Str.");
        driver.findElement(By.name("Line3")).sendKeys("No:10");
        driver.findElement(By.id("City")).sendKeys("New York");
        driver.findElement(By.id("State")).sendKeys("NY");
        driver.findElement(By.id("Zip")).sendKeys("456677");
        driver.findElement(By.id("Country")).sendKeys("USA");
    }

    public void submitOrder(){
        driver.findElement(By.cssSelector(".btn-primary")).click();

        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h2")));
        }
    }

    public  String getConfirmationText()
    {
        return  driver.findElement(By.cssSelector("h2")).getText();
    }

    public  void  returnToStore()
    {
        driver.findElement(By.linkText("Return to Store")).click();
    }

}
