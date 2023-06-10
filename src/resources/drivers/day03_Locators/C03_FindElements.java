package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        /*
findelement ile bir webelemente ulaşabilirken, birden fazla webElement için findelements() methodunu kullanırız.
Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
        */

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
       List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
       System.out.println("linklerListesi = " + linklerListesi.size());


        // Linkleri konsolda yazdırın
        linklerListesi.forEach(link -> {if (link.getText().isEmpty())System.out.println(link.getAttribute("href"));});
        /*
        2.yol//getText()-->ile etiket ismini alabilirsiniz
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
                                {System.out.println(link.getText());}});

        3.yol
        linklerListesi.stream().filter
        (webElement -> !webElement.getText().isEmpty()).
        forEach(webElement -> System.out.println(webElement.getText()));

         */
//      for(WebElement each:linklerListesi){

//           System.out.println(each.getText());
//       }

        // sayfayı kapatın
        driver.close();

    }
}
