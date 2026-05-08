package tests.K05_WebElements_Locators.D04_xPad_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testotomasyonu.com7addremove/");

        driver.findElement(By.xpath("//button[@id='sub-btn']")).click();

        WebElement removeButonu = driver.findElement(By.xpath(""));





    }
}
