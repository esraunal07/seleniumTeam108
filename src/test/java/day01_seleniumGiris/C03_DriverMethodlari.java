package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //gittiginiz sayfadaki tittle ve url'i yazdirin

        System.out.println("URL :" +driver.getCurrentUrl());
        System.out.println("Baslik :" +driver.getTitle());

        //Amazon anasayfaya gittiginizi test edin

        //test expected result ile actual result'in  karsilastirilmasidir.
        //ornegin url amazon iceriyorsa diyebiliriz.

        String expectedIcerik = "amazon" ;
        String actualUrl = driver.getCurrentUrl() ;


        if(actualUrl.contains(expectedIcerik)){ // amazon anasayfaya gittiysek
            System.out.println("Test PASSED");
        }else { //gidemediysek
            System.out.println("Test FAILED");
        }



    }
}