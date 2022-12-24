package day03Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelniumCan {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        /*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  "username" yazdirin
4. Password alanine "password" yazdirin
5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
6. Online Banking menusunden Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina "2020-09-10" yazdirin
9. Pay buttonuna tiklayin
10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
*/

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@class='signin btn btn-info']")).click();
        //3. Login alanine  "username" yazdirin
        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys("username");
        //4. Password alanine "password" yazdirin
        driver.findElement(By.cssSelector("input[id='user_password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("li#onlineBankingMenu")).click();
        driver.findElement(By.cssSelector("span[id='pay_bills_link']")).click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.cssSelector("input[id='sp_amount']")).sendKeys("1234");
        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.cssSelector("input[id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(3000);
        //9. Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("input[id='pay_saved_payees']")).click();
        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        WebElement success = driver.findElement(By.cssSelector("div[id='alert_content']"));
        String result = success.isDisplayed() ? "Test Payment PASSED" : "Test Payment FAILED";
        System.out.println(result);
    }

























}
