package day01drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Day01_DriverMethod {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","C:\\Users\\casper\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz

    }
}
