package day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        //Java Uygulamalarinda system ozelliklerini ayarlamak icin setproperty methodu ile kullaniriz.
        //setproperty
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver(); //ChromeDriver turunde yeni bir obje olusturduk
        driver.get("https://techproeducation.com");




    }
}
/*
System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliklerini ayarlamak için setProperty methodu ile kullanırız
        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "Key" değerini girerek "value"'ya ulaşabilirim
        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk
        driver.get("https://techproeducation.com");//get() methodu ile String olarak girilen url'e gideriz
 */
/*
Deploy..


Selenium browser’lari automate eder. Bir web sitesinde manual olarak yaptigimiz herseyin Selenium ile otomasyonunu yapariz.
Selenium, web uygulamalarini farkli tarayicilarda ve platformlarda test etmek icin kullanima acik olarak ucretsiz bir aractir.
Selenium yalnizca web tabanli uygulmalari otomasyon yapmaya odaklanir. Selenium jar dosyalari ile kurulabilir.
Selenium’u java, Python, ruby, .Net vb cesitli programlama dilleri ile yazilabilir.
IntelliJ IDEA, popular bir java editorudur.  Bircok Framework ve plugin ile calisma imkani verir.
Thread.sleep() ile kodlari bekletiriz. Intellij Thread ve nokta yazdigimizda sleep methodunu bize getirerek kolaylik saglar.
Software Testing Nedir?
Software yaparken bir mufettis gibi uygulamanin her kismini kontrol etmemiz gerekir.
Expected Result, Actual Result esit olup olmadiklarini software testing ile kontrol ederiz.
Expected result=Actual result ise test Passed
Expected result!=Actual result ise test Failed
Her user Story icin Positive ve Negative Testler yapilmalidir.
Test, musteri/isletme ihtiyaclarini karsilamak icin yapilir.
Bir uygulamayi test etmek icin onceden belirlenmis user story’ler ve tanimlanmis acceptance criteria’lar dikkate alinir.


Software Testing Neden Onemlidir?
Kodlarda, sistemde, yazilimda ya da dokumanda yapilan hatalar sonucunda defect olusabilir.
Defect olan kod calistirildiginda sistem beklenen fonksiyonlari gerceklestirmez ve basarisiz olur.
Urunun kalitesinden musteriye sunulmadan once emin olmak gerekir.
Yeniden calisma, duzeltme ve gelistirme masraflari testing ile azaltilir.
Gelistirme isleminin erken asamalarinda yanlislari testing ile saptamak mumkundur. Boylece zaman ve maliyetten tasarruf edilir.
Testing saves money and lives.
Manual (Functional) Testing Nedir?
Manual test, uygulamayi herhangi bir otomasyon araci olmadan manual test etmektir.
Manuel test kullanicilari dokumantasyon icin sinirli teknoloji (Exel vb) kullanir, ancak otomasyon araclari veya dili kullanmazlar.
Manual testte insan hatasi olabilir.
Tum Otomasyon Tester’lar herhangi bir otomasyon yapmadan once uygulmayi anlamak icin mutlaka test yapmalidir.
Iyi bir otomasyon tester ayni zamanda iyi bir manual tester’dir.
Hedefimiz hizli bir sekilde test yapmaktir.
Test Otomation Nedir?
Bir sistemi bir otomasyon araci (tool) yardimiyla test etmeye ‘Test Otomasyonu’ denir.
Otomasyon test yazilimi test verilerini Test Edilen Sistem’e girebilir, beklenen ve gercek sonuclari karsilastirabilir ve ayrintili test raporlari olusturabilir. TestNG, Cucumber gibi toolar ile test raporlamalari yapilabilir.
Bir test otomasyon tool’u kullanarak, calistirilan test paketini kaydetmek ve gerektiginde yeniden calistirmak mumkundur. Test paketi otomatik hale getirildikten sonra hicbir insan mudahalesi gerekmeksizin programlandigi zamanda calisabilir.
Manual Testing vs Automation Testing
Cucumber Framework’unda tek tek yapilacak testler icin adimlar ve otomasyon ile test yapan kodlar verilmistir.
Execution Time, People yonunden Manual testing Automation Testing’den ondedir.
Infrestructure(alt yapi) yonunden manual testing yine onem kazanir.
Kullanilan tools, Turnaround Time(Geri donus zamani), Training yonunden Automation Testing ondedir
En cok kullanilan test tool’lar: Selenium, Internal Tools(Sirketlerin kendi ic calismalarinda kullandiklari toollar), Junit, Microsoft, QTP, Test Complete, Selendroid, Appium, Jmeter
 */

















