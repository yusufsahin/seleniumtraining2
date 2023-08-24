package net.innovium.sportsstorepowithannotation.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class OrderTest {
    private WebDriver driver;

    private HomePage homePage;

    private  OrderPage orderPage;

    @BeforeEach
    public  void setup()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://sportsstore.innovium.net/");

        homePage= new HomePage(driver);
        orderPage= new OrderPage(driver);

    }

    @Test
    public  void Order()
    {
        homePage.selectCategory("Chess");
        homePage.addtoCart(0);
        homePage.goToCheckout();

        orderPage.enterDetails("John Doe", "ABC Bulv.", "996677 Str.", "No:10", "New York", "NY", "456677", "USA");
        orderPage.submitOrder();
        Assertions.assertEquals(orderPage.getConfirmationText(),"Thanks!");
        orderPage.returnToStore();
    }
}
