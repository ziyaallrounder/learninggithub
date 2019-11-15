import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class axata 
{
public static void main(String[]args)
{
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("file:///c:/users/admin/Desktop/10c445.html");

WebElement ele=driver.findElement(By.tagName("a"));

ele.click();
}
}