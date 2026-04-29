package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle());//Test Otomasyonu - Test Otomasyonu

        String expectedTitleIcerik ="Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");


        System.out.println(driver.getCurrentUrl());
        String expectedUrl = "https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");



        driver.getWindowHandle();
        String expectedSayfaKaynakIcerik ="otomasyon";
        String actualSayfaKaynagi = driver.getPageSource();

        if (actualSayfaKaynagi.contains(expectedSayfaKaynakIcerik)){
            System.out.println("sayfa kaynağı testi PASSED");
        }else System.out.println("sayfa kaynağı testi FAILED");



        Thread.sleep(3000);
        driver.quit();



    }
}
