package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavıgateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(1000);

         driver.get("https://www.wisequarter.com");
         Thread.sleep(1000);

         driver.navigate().back();
         Thread.sleep(1000);

         driver.navigate().forward();
         Thread.sleep(1000);





         driver.quit();









    }
}
