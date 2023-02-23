package Day07_actionsClass_fileTestleri;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYolu extends TestBase {

    @Test
    public void test01(){
        // Masaustumuzde flip isimli bir dosya bulundugunu test edin
        String dosyaYolu = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\flip";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
