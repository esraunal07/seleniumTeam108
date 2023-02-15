package Day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html\n");

        WebElement berlinElementi = driver.findElement(By.xpath("//*[@*='pid7_thumb']"));
        WebElement NycElementi = driver.findElement(By.xpath("//*[@*='pid3_thumb']"));
        WebElement bostonElementi = driver.findElement(By.xpath("//*[@*='pid6_thumb']"));
        WebElement seilorElementi = driver.findElement(By.xpath("//*[@*='pid11_thumb']"));

        /*
        Selenium 4 ile yeni gelen bir ozellik
        olur da bir elementi locate edemezsek
        2 sey ile o elementi locate edebiliriz.
        1- etrafindan bir webelement(sag,sol,ust,alt)
        2- locate edemedigimiz webelemente ait bir ozellik (tag veya attribute gibi)
         */

        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).below(NycElementi));

        System.out.println("berlin1 id: "+berlin1.getAttribute("id"));

        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));

        System.out.println("berlin2 id: " +berlin2.getAttribute("id"));

        WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).above(seilorElementi));

        System.out.println("berlin3 id: " +berlin3.getAttribute("id"));

        driver.close();
    }
}
