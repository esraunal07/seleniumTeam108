package Day09_excel_screenshot_jsExecutor;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C08_JavascriptExecutorClick extends TestBase {

    @Test
    public void test01(){

        // wisequarter anasayfaya gidelim

        driver.get ("https://www.wisequarter.com");
        //refresh diyerek reklami gecin
        driver.navigate().refresh();
        // Java Test otomation tanitimina kadar asagi inin
        WebElement otomasyonElementi = driver.findElement(By.xpath("(//img[@alt='Automation Engineer'])[1]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView();" ,otomasyonElementi);

        // ve resmi click yapin

        jse.executeScript("arguments[0].click();",otomasyonElementi);

        // ekrana "JUnit bitti" yazdirin

        jse.executeScript("alert('JUnit BITTI');");
        bekle(3);

    }
}
