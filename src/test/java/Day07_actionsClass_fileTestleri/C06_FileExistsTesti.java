package Day07_actionsClass_fileTestleri;

import Utilities.TestBase;
import org.bouncycastle.util.io.TeeInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_FileExistsTesti extends TestBase {

    @Test
    public void test01(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. luminoslogo.png dosyasını indirelim
        driver.findElement(By.linkText("luminoslogo.png")).click();
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        bekle(5);
        // dosya downloads'a inecegi icin dinamik dosya yolu olusturalim
        String dinamikDosyaYolu= System.getProperty("user.home")+"/Downloads/luminoslogo.png";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}
