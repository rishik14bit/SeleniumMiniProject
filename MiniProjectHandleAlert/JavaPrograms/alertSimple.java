package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertSimple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
        Thread.sleep(6000);
        //button[@class='btn btn-primary']
        //button[@class='btn btn-danger']
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(6000);
        Alert a=driver.switchTo().alert();
//        a.sendKeys("GenC");
        a.accept();
        Thread.sleep(6000);
        driver.close();
  
	}

}