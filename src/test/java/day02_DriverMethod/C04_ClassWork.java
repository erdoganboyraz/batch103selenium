package day02_DriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        //İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Yazısı : "+aramaSonucYazisi.get(0).getText());

        // Arama sonuc sayısını konsola yazdırınız
        String [] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc Sayısı : "+ sonucSayisi[2]);

        // Sonuc sayısını LAMBDA ile yazdırınız
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE = driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();








    }
}
