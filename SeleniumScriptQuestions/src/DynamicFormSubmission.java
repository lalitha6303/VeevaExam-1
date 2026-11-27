
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DynamicFormSubmission {
  public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.get("https://qaplayground.com/practice/forms");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      driver.findElement(By.name("email")).sendKeys("lalitha@gmail.com");
      driver.findElement(By.name("password")).sendKeys("Lalitha@6303");
      driver.findElement(By.id("loginSubmitBtn")).click();
      driver.findElement(By.id("firstName")).sendKeys("Lalitha");

      WebElement Dropdown=driver.findElement(By.id("country"));
      Dropdown.click();
      Select s=new Select(Dropdown);
      s.selectByVisibleText("India");
      s.selectByIndex(2);
      s.selectByValue("AU");

      WebElement checkbox=driver.findElement(By.xpath("//input[@id='terms']"));
      if(!checkbox.isSelected())
      {
          checkbox.click();
      }




  }
}
