package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
/*
Bir webelementin locate'ini birden fazla kullanacaksaniz bir Webelement'te değişken olarak atayabilirsiniz.
        Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz
        1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
        2-webelemente tıklayacaksak click() methodu kullanırız
        3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
        4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.

 //aramakutusunu 1 kere yapin sonraa html kodlar cikinca tekrar yapin
Eger bir "webelement"i birden fazla kez kullanmayacaksaniz bir "WebElement"e assign etmeyebilirsiniz.
WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
 aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
 */
        // aramakutusunu locate ediniz ve Nutella/iphone aratınız
        //2.syntanx
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);//

        Thread.sleep(2000);

        // sayfayı kapatınız
        driver.close();
    }
}
