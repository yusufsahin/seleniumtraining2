package net.innovium.sportsstoreorderpo.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public  void selectProduct()
    {
        driver.findElement(By.linkText("Chess")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card:nth-child(1) h4")));
        }
    }

    public void addToCart()
    {
        driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
        }
    }

    public void goToCheckout()
    {
        driver.findElement(By.linkText("Checkout")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
        }
    }
}
