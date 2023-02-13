package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        // CDwindow-88F31F8966C14509B330EC30E5F8AEF9

        //getwindowhandle selenium tarafindan her driver sayfasi icin uretilen
        // unique handle degerini döndurur
        //getwindowhandles() ise test sirasinda birden fazla sayfa acilmissa
        //bir set olarak, tum sayfalarin window handle degerlerini dondurur.

        //sayfa kodlari "2 hours weekly meeting with the team" iceriyor mu test edin

        System.out.println(driver.getPageSource());
        String expectedIcerik = "2 hours weekly meeting with the team" ;
        String actualSayfaKodlari = driver.getPageSource() ;

            if(actualSayfaKodlari.contains(expectedIcerik)){ // amazon anasayfaya gittiysek
                System.out.println("Test PASSED");
            }else {                                          //gidemediysek
                System.out.println("Test FAILED");
            }


        driver.quit();
        //close() ve quit() ikiside sayfa kapatmak icin kullanilir
        //close() sadece bir sayfa kapatirken
        //quit() test sirasinda acilan tum sayfalari kapatir.

    }
}
