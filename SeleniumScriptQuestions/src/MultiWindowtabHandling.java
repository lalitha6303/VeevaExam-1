import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class MultiWindowtabHandling {
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://toscaautomation.com/practice/multiple-windows/");
        driver.findElement(By.xpath("//button[text()='Open new window']")).click();
        System.out.println(driver.getTitle());

        String parent=driver.getWindowHandle();

        Set<String>alladdress=driver.getWindowHandles();
        for(String i:alladdress) {
            driver.switchTo().window(i);
        }
        System.out.println(driver.getTitle());

        driver.close();

        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());

        driver.quit();









    }

}
