package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","C:\\Users\\casper\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr");

    }

}
