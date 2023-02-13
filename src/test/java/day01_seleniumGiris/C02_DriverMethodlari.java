package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        /*
        Jar dosyalarini yukleyerek Selenium'u kullanir hale getirdik.
        Ancak her bir class'in hangi browser ile calismasini istiyorsak o browser ile ilgili
        driveri class'da tanimlamamiz lazim.

        browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin Java'daki
        System  classindan setProperty() kullanilir.

        Methoda 2 parametre ekleyecegiz
        1. parametre herkes icin ayni
        2. parametre bu driverin dosya yolu
            herkesin bilgisayarinda farkli olabilir. windows pc.lerde sonunda .exe yazilmalidir.
            mac'lerde .exe olmaz.

         */

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriver driver =new ChromeDriver();

        //istenen sayfaya gitmek icin

        driver.get("https://wwww.amazon.com") ;


    }

}
