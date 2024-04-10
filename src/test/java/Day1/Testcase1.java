package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testcase1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        WebDriver driver1 = new EdgeDriver();

        //open the link of website
        driver.get("https://www.youtube.com/");

        //assign website link to variable
        String websitename = driver.getTitle();

        //validate website name with actual website URL
        if (websitename.equals("YouTube"))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        //close the driver
        driver.quit();

    }
}
