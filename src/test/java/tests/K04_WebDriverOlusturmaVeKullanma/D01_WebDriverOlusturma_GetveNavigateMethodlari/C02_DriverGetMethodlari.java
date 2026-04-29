package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle());// sayfanın başlığını getirir.Test Otomasyonu - Test Otomasyonu
        System.out.println(driver.getCurrentUrl());// url adresi getirir.  https://www.testotomasyonu.com/




        Thread.sleep(3000);
        driver.quit();











    }
}
