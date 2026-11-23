package sda.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exercise6 {

    WebDriver driver;

    @Before
    public void init() {
        System.out.println("executing init() method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown() {
        System.out.println("executing tearDown() method");
        driver.close();
    }

    @Test
    public void successfulLoginOrangeHRMTest() throws InterruptedException {

        //1. Go to https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(3000);

        //2. In the field 'Username' enter: Admin
        driver.findElement(By.name("username")).sendKeys("Admin");

        Thread.sleep(3000);

        //3. In the 'Password' field enter: admin123
        driver.findElement(By.name("password")).sendKeys("admin123");

        Thread.sleep(3000);

        //4. Click the Login button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);

        //5. Make sure the user has logged in
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }
}
