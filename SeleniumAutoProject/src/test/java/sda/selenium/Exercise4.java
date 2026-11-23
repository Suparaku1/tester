package sda.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

    WebDriver driver;

    @Before
    public void init() {
        System.out.println("executing init() method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        System.out.println("executing tearDown() method");
        driver.close();
    }

    @Test
    public void printSdacademyTitle() {
        System.out.println("executing test case printSdacademyTitle()");
        driver.get("https://sdacademy.dev/");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void printStackoverflowTitle() {
        System.out.println("executing test case printStackoverflowTitle()");
        driver.get("https://stackoverflow.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Stack Overflow - Where Developers Learn, Share, & Build Careers";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void printStackoverflowURL() {
        System.out.println("executing test case printStackoverflowURL()");
        driver.get("https://stackoverflow.com/");
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = "https://stackoverflow.com/";
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void driverNavigationTest() throws InterruptedException {
        System.out.println("executing test case driverNavigationTest()");
        driver.get("https://stackoverflow.com/");

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }
}
