package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static void main(String[] args) {



    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
        //set path
        //Sisteme driverimizi tanitiyoruz.
        //Driverimizin yolunuda gosteriyoruz
        System.setProperty("webdriver.chromedriver","drivers/chromedriver_win32");
        //Create chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // Open google home page https://www.google.com/
        driver.get("https://www.google.com");
        // get methodu daha hizli calisir. navigate ise daha cok bagimli senoryalarda tercih edilir.

       // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //Navigate back to google
        driver.navigate().back();
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        //Close/Quit the browser
        driver.quit();
        //And last step : print "All Ok" on console
        System.out.println("All Ok");










    }

}