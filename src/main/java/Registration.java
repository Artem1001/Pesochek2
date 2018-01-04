import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

    public static void main (String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("http://pesochek.dp.ua");
        driver.findElement(By.linkText("Регистрация")).click();
        WebElement field = driver.findElement(By.name("txtfirstname"));
        field.sendKeys("Вася");
        WebElement field2 = driver.findElement(By.name("txtlastname"));
        field2.sendKeys("Василиевич");
        WebElement field3 = driver.findElement(By.name("txtemail"));
        field3.sendKeys("morda3@i.ua");
        WebElement field4 = driver.findElement(By.name("txtpassword"));
        field4.sendKeys("Test12");
        WebElement field5 = driver.findElement(By.id("emailregister")).click();
        driver.get("http://i.ua");
        WebElement field6 = driver.findElement(By.name("login"));
        field6.sendKeys("morda3@i.ua");


    }

    public static WebDriver initChromeDriver ()
    {
        System.setProperty("webriver.chrome.driver", "C:/webdrivers/chromedriver");
        return new ChromeDriver();
    }
}
