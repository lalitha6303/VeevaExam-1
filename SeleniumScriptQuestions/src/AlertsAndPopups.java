import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import java.time.Duration;

public class AlertsAndPopups {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert confirmalert=driver.switchTo().alert();
        System.out.println(confirmalert.getText());
        confirmalert.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert PromptAlert=driver.switchTo().alert();
        PromptAlert.sendKeys("Automation Test");
        System.out.println(PromptAlert.getText());
        PromptAlert.dismiss();



    }


}
