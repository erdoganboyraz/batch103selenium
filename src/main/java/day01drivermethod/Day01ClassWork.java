package day01drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01ClassWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Baslığı : "+driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();

        //Sayfa handle degerini yazdirin
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        //Sayfayi kapatin.


    }
}
