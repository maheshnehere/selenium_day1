package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Orange {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "/usr/bin/microsoft-edge");
        EdgeDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
        driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");

        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        driver.close();

    }

}
