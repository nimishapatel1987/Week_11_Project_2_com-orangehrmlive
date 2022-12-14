package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Project_2_EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        //typeemail to email field
        emailField.sendKeys("nimisha123");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        //type password to password field
        passwordField.sendKeys("1234");


        //Close the browser
       // driver.quit();

    }

    }


