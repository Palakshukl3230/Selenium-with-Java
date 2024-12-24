package Selenuim;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	WebElement a=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
	a.click();
	Alert b=driver.switchTo().alert();
	b.accept();
	WebElement d=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	d.click();
	WebElement c=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	c.click();
	Alert s=driver.switchTo().alert();
	s.dismiss();
	WebElement tb=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
	tb.click();
	WebElement dpb=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	dpb.click();
	Alert dpbc=driver.switchTo().alert();
	dpbc.sendKeys("Palak");
	dpbc.accept();
	
	}
}
