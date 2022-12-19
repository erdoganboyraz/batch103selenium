package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","C:\\Users\\casper\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
          /*
            En temel haliyle otomasyon yapmak için  Class'ımıza otaomasyon için gerekli olan
        webdriver'in yerini göstermemiz gerekir. Bunun için java kütüphanesinden System.setProperty()
        methodunun içine ilk olarak driver'i yazarız. İkinci olarak driver'in fiziki yolunu kopyalarız
         */
        driver.get("https://www.amazon.com.tr");

    }

}
