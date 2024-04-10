package Day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Testcase2 {
    public static String browser = "Edge";
    public static WebDriver driver; // Use WebDriver interface type
    public static void main(String[] args) {

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
////        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard-user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
////        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.className("btn_action")).click();
//        driver.close();


        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {

            driver = new EdgeDriver();
        }

//        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user");
//        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")));
        passwordField.sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.close();

            }
        }



