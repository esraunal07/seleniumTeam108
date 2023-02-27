package Day09_excel_screenshot_jsExecutor;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class C04_TumSayfaScreenshot  extends TestBase {

    @Test
    public void test01() throws IOException {

        // amazon anasayfaya gidin
        driver.get("https://amazon.com");
        // Nutella icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin nutella icerdigini test edin
        String actualSonucYazisi =driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"))
                                .getText();
        String expectedIcerik = "Nutella";

        // ve rapora eklemek icin tum sayfanin fotografini cekin

        // Tum sayfa screenshot icin
        // 1- TakeScreenshot objesi olusturuyoruz

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2- screenshotu kaydedecegimiz bir dosya olusturalim.

        File tumSayfaSs =new File("target/screenShot.png");

        // 3- gecici bir dosya olusturup ts objesi ile cekilen fotografi dosyaya kaydediyoruz,

        File geciciresim =ts.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi, tumSayfaSs dosyasina kopyalayalim

        FileUtils.copyFile(geciciresim,tumSayfaSs);

        bekle(3);

    }
}
